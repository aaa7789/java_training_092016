package com.mms.java8.streams.classwork;

import static java.util.stream.Collectors.*;
import java.util.stream.Collectors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparing;;

public class TraderTest {

	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

		// find all transactions for 2011 and sort them from small to high by
		// value

		List<Transaction> tran2011List =  transactions.stream()
				                          .filter(tran -> tran.getYear() == 2011)
				                           .sorted( (trans1, trans2) -> trans1.getValue().compareTo(trans2.getValue()))
				                          .collect(toList());
		
		System.out.println("transactions for year 2011 with ascending order on value " + tran2011List);
		
		
		
		// other way using method reference and comparing method from Comparator
		// interface
		List<Transaction> tran2011List2 =  transactions.stream()
				                            .filter(tran -> tran.getYear() == 2011)
				                            .sorted(comparing(Transaction :: getValue))
				                            .collect(toList());
		System.out.println("2011 transactions " + tran2011List2);
		

		// what are all unique cities where traders work
		List<String> uniqueCities = transactions.stream()
				                    .map(tran -> tran.getTrader().getCity())
				                    .distinct()
				                    .collect(toList());
		System.out.println("unique cities where trades work " + uniqueCities);
		

		// find all traders from cambridge and sort them by name
		List<String> cambridgeTraders = transactions.stream()
				                        .filter(trans -> "Cambridge".equals(trans.getTrader().getCity()))
				                        .map(trans -> trans.getTrader().getName())
				                        .sorted()
				                        .collect(toList());
		
		System.out.println("cambridge traders sorted by name " + cambridgeTraders);

		

		// other way of doing above one
		List<String> cambridgeTraders2  = transactions.stream()
				                          .map( tran -> tran.getTrader())
				                          .filter(trader -> "Cambridge".equals(trader.getCity()))
				                          .distinct()
				                          .sorted(comparing(Trader :: getName))
				                          .map(Trader :: getName)
				                          .collect(toList());
		
		System.out.println("combridge traders using compartor methods" + cambridgeTraders2);
		
		
		// return string of all trader names sorted alphabetically
  List<String> traderNames = transactions.stream()
		                     .map(tran -> tran.getTrader().getName())
		                     .sorted()
		                     .collect(toList());
  System.out.println("trader names " + traderNames);
		

		// other way of doing
		

		// are any traders based in Milan
		
  boolean isMilanTrader = transactions.stream()
		                  .anyMatch(tran ->"Milan".equals( tran.getTrader().getCity()));
  System.out.println("milan traders exists  "  + isMilanTrader);

		// print all transcation values from traders living in Cambridge
  
  List<Integer> transList = transactions.stream()
		                  .filter(trans -> "Cambridge".equals(trans.getTrader().getCity()))
		                .map(tran -> tran.getValue())
		                 .collect(toList());
  System.out.println("tanasction values " + transList);

		

		// what is the highest value of all transactions

		

		// other way of doing
		

		// find transaction with smallest value

		

		// more streams using Collectors interface
		

	}

}
