package com.mms.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FruitTest {

	public static void main(String[] args) {
		
		Fruit fruit1 = new Fruit(1, "banana");
		Fruit fruit2 = new Fruit(4, "orange");
		Fruit fruit3 = new Fruit(6, "apple");
		Fruit fruit4 = new Fruit(11, "grapes");
		
		List<Fruit> list1 = new ArrayList<Fruit>();
		list1.add(fruit1);
		list1.add(fruit4);
		
		list1.add(fruit3);
		list1.add(fruit2);
		
		System.out.println( "list1" +list1.toString());
		
		/*List<Fruit> list2 = new LinkedList<Fruit>();
		list2.add(fruit1);
		list2.add(fruit2);
		list2.add(fruit3);
		list2.add(fruit4);
		System.out.println("list2 " +list1.toString());*/
		
		//sorting
		Collections.sort(list1, new Comparator<Fruit>() {

			@Override
			public int compare(Fruit fruit1, Fruit fruit2) {
				
				return  fruit2.getFruitId() -fruit1.getFruitId() ;
			}
		});
		System.out.println("after sorting " + list1);

	}

}
