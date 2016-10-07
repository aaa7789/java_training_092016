package com.mms.java8.streams.classwork;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class DishTest {

	public static void main(String[] args) {
		
		List<Dish> dishList = Arrays.asList( new Dish("tomoto",true, 100, "VEG"),
				                               new Dish("chicken",true, 400, "MEAT"),
				                               new Dish("fish",true, 600, "SEAFOOD"),
				                               new Dish("goat",true, 500, "MEAT"),
				                               new Dish("squash",true, 200, "VEG"),
				                               new Dish("carrot",true, 300, "VEG"),
				                               new Dish("egg",true, 200, "MEAT"),
				                               new Dish("potato",true, 150, "VEG"),
				                               new Dish("cabage",true, 500, "VEG"),
				                               new Dish("prawans",true, 300, "SEAFOOD"),
				                               new Dish("beef",true, 800, "MEAT"),
				                               new Dish("pork",true, 1000, "MEAT")
				                               );
		
		System.out.println("dish list with out filer" + dishList);
		
		List<Dish> moreColoriesList = DishHelperJava7.filter(dishList);
		System.out.println("dishes with more than 300 colories " + moreColoriesList);
		
		List<Dish> moreColoriesJava8 = DishHelperJava7.filterByJava8(dishList,
				                       (Dish dish) -> dish.getColories() > 600 );
		
		System.out.println("using java8 lamda " + moreColoriesJava8);
		
		List<Dish> vegiesJava8 = DishHelperJava7.filterByJava8(dishList,
                     (Dish dish) ->  "VEG".equals( dish.getType() ));

         System.out.println("vegie dishes using lamda " + vegiesJava8);
         
         //using streams
         
         List<Dish> vegiesUsingStreams = dishList.stream()
        		                         .filter((Dish dish) ->  "VEG".equals( dish.getType()))
        		                         .collect(toList());
         
         System.out.println("vegies using streams " + vegiesUsingStreams);
         
         
         //count number of vegie dishes
         // select count(*) from dish d where d.type = 'VEG'
         
         long vegieCnt = dishList.stream()
        		        .filter(dish -> "VEG".equals(dish.getType()))
        		        .count();
         
         System.out.println("number of vegie dishes " + vegieCnt);
         
         //print all dishes names which are having more than 500 colories
         
         List<String> dishesNames = 
        		                  dishList.stream()
        		                  .filter(dish -> dish.getColories() > 500)
        		                  .map(dish -> dish.getName())
        		                  .collect(toList());
         
         System.out.println("dish name having more than 500 colories " + dishesNames);
         
         //using method reference
         List<String> dishesNamesUsingMethodReg = 
                 dishList.stream()
                 .filter(dish -> dish.getColories() > 500)
                 .map(Dish :: getName)
                 .collect(toList());
         
         System.out.println("dish name having more than 500 colories using method reference " + dishesNamesUsingMethodReg);
         
        // print first three vegie dishes names
        //  // select top 3 d.name from dish d where d.type = 'VEG' 
         
         
         List<String> topThreeVegies =  dishList.stream()
        		                      .filter(dish ->
        		                      {
        		                    	  System.out.println("from filter method" + dish.getType());
        		                    	return   "VEG".equals(dish.getType()); 
        		                      }
        		                      )
        		                      .map(dish ->
        		                      {
        		                    	  System.out.println("from map method");
        		                    	 return  dish.getName(); 
        		                      })
        		                      .limit(3)
        		                      .collect(toList());
         
         System.out.println("top three vegie dishes " + topThreeVegies);
         
         
         //wanna sort the list with calories asc
         //  using java7
         
         System.out.println("before sorting " + dishList);
         
      /*   dishList.sort(new Comparator<Dish>() {

			@Override
			public int compare(Dish dish1, Dish dish2 ) {
				
				int res = 0;
				if(dish1.getColories() > dish2.getColories())
					res =1;
				else
					res = -1;
				return res;
			}
        	 
			
		});*/
         
         
         //using java8 and lambda
       //  dishList.sort((dish1, dish2) -> Integer.valueOf(dish2.getColories()).compareTo(dish1.getColories()));
         
         //using streams
         dishList.sort(Comparator.comparingInt(Dish :: getColories));
         
         System.out.println("sorted dishes " + dishList);
         
         //group by 
         // select d.type from dish d group by (d.type)
         
   //using lambda
         Map<String, List<Dish>>  dishMap =     dishList.stream()         
                                           .collect(groupingBy(dish -> dish.getType()));
    
    //method reference
    Map<String, List<Dish>>  dishMap2 =     dishList.stream()         
            .collect(groupingBy(Dish :: getType));
    
    System.out.println(dishMap);
    
    //sum of calories of all dishes
    
    IntSummaryStatistics sumOfCol =   dishList.stream()
    		         .collect(summarizingInt(Dish :: getColories));
    
    System.out.println("sum of colories of all Dishes  " + sumOfCol.getSum());
    System.out.println("max colories in dishes " + sumOfCol.getMax());
    System.out.println("average colories in dishes " + sumOfCol.getAverage());
	

	}

}
