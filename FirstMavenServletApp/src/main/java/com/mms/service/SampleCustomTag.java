package com.mms.service;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

public class SampleCustomTag  extends SimpleTagSupport{
	
	private int number;

	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void doTag() throws JspException, IOException
	{
		JspWriter out = getJspContext().getOut();
		out.println(number * number);
		
	}
	
	
	

}

	
