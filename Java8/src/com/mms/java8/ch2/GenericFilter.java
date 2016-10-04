package com.mms.java8.ch2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GenericFilter {

	public static <T> List<T> filter(List<T> inList, Predicate<T> p) {

		List<T> result = new ArrayList<T>();
		for (T t : inList) {
			if (p.test(t)) {
				result.add(t);
			}
		}
		return result;

	}

}
