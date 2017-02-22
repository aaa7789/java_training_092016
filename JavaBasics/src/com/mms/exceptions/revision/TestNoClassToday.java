package com.mms.exceptions.revision;

public class TestNoClassToday {

	public static void main(String[] args) {
		NoClassToday noClassToday = new NoClassToday();
		try {
			noClassToday.checkClassIsThere();
		} catch (NoClassException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			System.out.println("this is from finally");
		}
		
	}

}
