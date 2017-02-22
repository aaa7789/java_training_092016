package com.mms.thread1.revision.executor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import java.util.stream.Stream;

/**
 * @author SSangapalli
 *
 */
public class FileContentMatcher implements Runnable {

	private Path path;

	private Semaphore lock = null;

	private String tagLibMatcher = "";

	@Override
	public void run() {

		BufferedReader Reader = null;

		try {
			System.out.println("name of thread which is currently running : " + Thread.currentThread().getName());
			
				CharsetDecoder decoder = Charset.forName("UTF-8").newDecoder();
				decoder.onMalformedInput(CodingErrorAction.IGNORE);				
				Reader inputReader = new InputStreamReader(Files.newInputStream(path), decoder);
				Reader = new BufferedReader(inputReader);
				Stream<String> fileStream = Reader.lines();
				Iterator<String> fileItr = fileStream.limit(50).iterator();
				boolean match = false;
				String action = null;
				String prefix = "";
				int startIndex = 0;
				int endIndex = 0;
				int lineNumber = 0;
				while (fileItr.hasNext()) {
					
					action = fileItr.next();
					
					if (action.contains(getTagLibMatcher())) {
						FilePoller.fileNamesQueue.add(path.toString());
						
					}
	
					lineNumber++;
				}
				if (match) {
	
					checkforTagLib(prefix, lineNumber);
				}
				FilePoller.completed.incrementAndGet();

		} catch (IOException e) {
			System.out.println("Path of File Error********************** "+path.toString());
			e.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Path of File Error********************** "+path.toString());

			ex.printStackTrace();
		} finally {

			//lock.release();
		
			try {
				if (Reader != null) {

					Reader.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	private void checkforTagLib(String prefix, int lineNumberToStart) {
		BufferedReader Reader = null;
		try {
	
				CharsetDecoder decoder = Charset.forName("UTF-8").newDecoder();
				decoder.onMalformedInput(CodingErrorAction.IGNORE);
				Reader inputReader = new InputStreamReader(Files.newInputStream(path), decoder);
				Reader = new BufferedReader(inputReader);
				Stream<String> fileStream = Reader.lines();
				Iterator<String> fileItr = fileStream.skip(lineNumberToStart).iterator();
				String matchStr = "";
				if (prefix != null) {
					prefix = prefix.trim();
				}
				prefix = prefix + ":";
				while (fileItr.hasNext()) {
					matchStr = fileItr.next();
					if (matchStr.contains(prefix)) {
						// System.out.println(matchStr+" "+path.toString());
						FilePoller.fileNamesQueue.add(path.toString());
						break;
					}

			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				Reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public Path getPath() {
		return path;
	}

	public void setPath(Path path) {
		this.path = path;
	}

	public Semaphore getLock() {
		return lock;
	}

	public void setLock(Semaphore lock) {
		this.lock = lock;
	}

	public String getTagLibMatcher() {
		return tagLibMatcher;
	}

	public void setTagLibMatcher(String tagLibMatcher) {
		this.tagLibMatcher = tagLibMatcher;
	}

}
