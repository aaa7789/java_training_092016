package com.mms.java8.streams;

import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.List;

import javax.swing.RowFilter.ComparisonType;

public class TraderTest {

	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), 
				new Transaction(mario, 2012, 700), 
				new Transaction(alan, 2012, 950));
		
		//find all transactions for 2011 and sort them from small to high by value
		
	List<Transaction> sortedList =     transactions.stream().filter((Transaction trans) -> trans.getYear() == 2011)
	                          .sorted((Transaction a, Transaction b) -> a.getValue().compareTo(b.getValue()))
	                          .collect(toList());
	
	System.out.println("2011 transactions sorted" +sortedList);
	
	//what are all unique cities where traders work
	List<String> uniqueCities =  transactions.stream()
			                         .map((Transaction trans) -> trans.getTrader().getCity())
			                         .distinct()
			                         .collect(toList());
	System.out.println("unique cities " +uniqueCities);
	
	//find all traders from cambridge and sort them by name
	
	List<String> cambridgeTraders =  transactions.stream()
                                     .filter((Transaction trans) ->"Cambridge".equals( trans.getTrader().getCity())) 
                                     .map((Transaction trans) -> trans.getTrader().getName())
                                     .sorted()
                                     .collect(toList());
	System.out.println("Cambridge" + cambridgeTraders);
	
	
	// return string of all trader names sorted alphabetically
	
	List<String> traderNames = transactions.stream()
			                   .map((trans) -> trans.getTrader().getName())
			                   .sorted()
			                   .collect(toList());
	
	System.out.println("trader names sorted " + traderNames);
	
	// are any traders based in Milan
	boolean milanTraders = transactions.stream()
			                    .anyMatch(trans -> trans.getTrader().getCity().equals("Milan"));
			                    
	
	// print all transcation values from traders living in Cambridge
	
	List<Integer> transValues = transactions.stream()
			                     .filter(trans -> "Cambridge".equals(trans.getTrader().getCity()))
			                     .map( trans -> trans.getValue())
			                     .collect(toList());
	
	System.out.println("all transaction values of Cambridge traders " + transValues);
	
	// what is the highest value of all transactions
	
	int highestTrans = transactions.stream()
			           .map( trans -> trans.getValue())
			           .max( (a, b) -> a.compareTo(b))
			           .get();
	System.out.println("highest transaction value " + highestTrans);
	
	//find transaction with smallest value
	
	int smallTrans = transactions.stream()
	           .map( trans -> trans.getValue())
	           .max( (a, b) -> b.compareTo(a))
	           .get();
System.out.println("highest transaction value " + smallTrans);
	
			                      

	}

}
