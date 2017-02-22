package com.mms.thread1.revision.executor;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class FilePoller {
	
	public static ConcurrentLinkedQueue<String> fileNamesQueue = new ConcurrentLinkedQueue<>();
	
	private String outFileFolder="/practice/java_training/file/out" + "/";
	private String inFileFolder="/practice/java_training/file/in";;
	private String tagLibMatcher="car";
    public static AtomicInteger completed = new AtomicInteger(0);
    
    public FilePoller() {

	}
    
    
    public void processFiles() throws IOException {
		// hard code for now read for property file.....
		/// c:/vas/pjsp
		Path path = Paths.get(inFileFolder);
		// Files.newDirectoryStream(path)
		try {
			
				System.out.println("InFolder Path *****************************:"+inFileFolder);			 
				System.out.println("Out Folder Path ***************************:"+outFileFolder);
				System.out.println("TagLib Matcher String **********************:"+tagLibMatcher);
				
				ExecutorService executorService = Executors.newFixedThreadPool(1);
				
				Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
					
					
	
					@Override
					public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
						
						if (!attrs.isDirectory())
						{

							SearchFile searchFile = new SearchFile(file, tagLibMatcher );
							executorService.execute(searchFile);
							
						}
	
								
						
									
						
						return FileVisitResult.CONTINUE;
					}
	
				});
	
				
				generateFile();
				executorService.shutdown();
				
			

		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

	private void generateFile() {

		String fileName = getFileName();

		fileName = outFileFolder + fileName;
		
		System.out.println("Number of files contains TagLib********************** :"+fileNamesQueue.size());

		Path path = Paths.get(fileName);

		try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {

			fileNamesQueue.forEach(action -> {

				try {
					writer.write(action + "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			});

			System.out.println("Generated file in following path **********************:" + path.toString());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private String getFileName() {
		
		String tagName=tagLibMatcher.substring(0);
		LocalDateTime dateTime = LocalDateTime.now();
		String date = dateTime.format(DateTimeFormatter.ofPattern("MMddyyyyhhmmss"));
		StringBuilder builder = new StringBuilder();
		builder.append(tagName).append("_").append(date).append(".txt");
		return builder.toString();

	}


}
