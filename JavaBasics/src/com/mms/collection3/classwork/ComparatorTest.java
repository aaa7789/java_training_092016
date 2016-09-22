package com.mms.collection3.classwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		
		List<Car> carList = new ArrayList<Car>();
		
		Car hundai = new Car(4, "Elantra",2010 );
		Car hundai1 = new Car(4, "Elantra1",2014 );
		Car hundai2 = new Car(4, "Elantra2",2011 );
		Car hundai3 = new Car(4, "Elantra3",2004 );
		Car hundai4 = new Car(4, "Elantra4",2016 );
		
		
		//   2010 2011 2014
		
		carList.add(hundai);
		carList.add(hundai1);
		carList.add(hundai2);
		carList.add(hundai3);
		carList.add(hundai4);
		
		System.out.println( "before sort" +carList);
		
		Collections.sort(carList);
		
		System.out.println( "after sort" +carList);
		/*
		List<String> nameList = Arrays.asList("Rishi", "Vindhya", "anish");
		System.out.println("before sort" +nameList );
		
		Collections.sort(nameList);
		
		System.out.println("after sort" +nameList );*/
		
		 

	}

}
