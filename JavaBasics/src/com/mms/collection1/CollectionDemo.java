package com.mms.collection1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {
	public static void main(String[] args) {
	      // ArrayList 
	      List<String> a1 = new ArrayList<String>();
	      a1.add("Zara");
	      a1.add("Mahnaz");
	      a1.add("Ayan");
	      a1.add(1, "raji");
	      System.out.println(" ArrayList Elements");
	      System.out.print("\t" + a1);

	      // LinkedList
	      List<String> l1 = new LinkedList<String>();
	      l1.add("Zara");
	      l1.add("Mahnaz");
	      l1.add("Ayan");
	      l1.add(2, "raji");
	      System.out.println();
	      System.out.println(" LinkedList Elements");
	      System.out.print("\t" + l1);

	      // HashSet
	      Set s1 = new HashSet(); 
	      s1.add("Zara");
	      s1.add("Mahnaz");
	      s1.add("Ayan");
	      s1.add("Zara");
	      System.out.println();
	      System.out.println(" Set Elements");
	      System.out.print("\t" + s1);

	      // HashMap
	      Map m1 = new HashMap(); 
	      m1.put("Zara", "8");
	      m1.put("Mahnaz", "31");
	      m1.put("Ayan", "12");
	      m1.put("Daisy", "14");
	      m1.put("", "11");
	      m1.put("Daisy", "14");
	      m1.put("Zara", "18");
	      System.out.println();
	      System.out.println(" Map Elements");
	      System.out.print("\t" + m1);
	   }

}
