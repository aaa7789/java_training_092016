package com.mms.lambda.classwork;

public interface AppleFilter {
	
	public boolean filter(Apple apple);
	
	default public int add(int a, int b)
	{
		return a +b;
	}

}
