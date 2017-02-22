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
import java.util.stream.Stream;

public class SearchFile implements Runnable {

	private Path path;
	private String searchStr;
	


	public SearchFile(Path path, String searchStr) {
		super();
		this.path = path;
		this.searchStr = searchStr;
	}

	@Override
	public void run() {

		BufferedReader Reader = null;

		try {
			System.out.println("name of thread which is currently running : " + Thread.currentThread().getName());
			
			Thread.sleep(200);

			CharsetDecoder decoder = Charset.forName("UTF-8").newDecoder();
			decoder.onMalformedInput(CodingErrorAction.IGNORE);
			Reader inputReader = new InputStreamReader(Files.newInputStream(path), decoder);
			Reader = new BufferedReader(inputReader);
			Stream<String> fileStream = Reader.lines();
			Iterator<String> fileItr = fileStream.limit(50).iterator();
			boolean match = false;
			String action = null;
			//System.out.println("the file contains the search string " +  path);

			while (fileItr.hasNext()) {

				action = fileItr.next();
				

				if (action.contains(getSearchStr())) {
					FilePoller.fileNamesQueue.add(path.toString());
					System.out.println("the file contains the search string " +  path);

				}

			}

			FilePoller.completed.incrementAndGet();

		} catch (IOException e) {
			System.out.println("Path of File Error********************** " + path.toString());
			e.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Path of File Error********************** " + path.toString());

			ex.printStackTrace();
		} finally {

			// lock.release();

			try {
				if (Reader != null) {

					Reader.close();
				}

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

	public String getSearchStr() {
		return searchStr;
	}

	public void setSearchStr(String searchStr) {
		this.searchStr = searchStr;
	}

}
