package com.mms.exceptions.revision;

import java.util.Calendar;

public class NoClassToday {
	
	public void checkClassIsThere() throws NoClassException
	{
		
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		if(day == 1 || day == 5 || day == 6)
		{
			throw new NoClassException("no class today , Friday Saturday and Sunday are holidays");
		}
		
		System.out.println(day);
		
	}

}
