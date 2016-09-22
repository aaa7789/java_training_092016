package com.mms.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) throws Throwable {
		File file = new File("C://practice//FileReadTest.txt");
		//checked exception
		
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//runtime exceptions
		
		Animal animal = null;
	//	animal.getAge();
		
		
		int a = 0;
		int b= 5;
		
		try
		{
			int res = b/a;	
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
				
		}
		

	}

}

class Animal
{
	String name;
	int    age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
