package com.mms.exceptions.revision;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderTest {

	public static void main(String[] args) {
		FileReaderTest fileReaderTest = new FileReaderTest();
		
		File file = new File("C://practice//FileReadTest1.txt");
		FileReader reader;
		
		try {
			fileReaderTest.readFile(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int a = 10;
		int b = 0;
		int c = a/b;
		System.out.println(c);
				
		
		  
		/*try {
			reader = new FileReader(file);
			BufferedReader bufferReader = new BufferedReader(reader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		

	}
	
	public void readFile(File file) throws FileNotFoundException
	{
		try
		{
			FileReader reader = new FileReader(file);
		}
		catch(Exception ex)
		{
			
			throw new FileNotFoundException(ex.getMessage());
		}
		
		
	}

}
