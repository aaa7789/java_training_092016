package com.mms.java8.ch2;

import com.mms.lambda.Apple;

public class AppleGreenColorPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {		
		
		return "green".equals(apple.getColor());
	}

}
