package com.mms.collection1.compare;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
	public static void main(String args[]){

	Fruit1[] fruits = new Fruit1[4];

	Fruit1 pineappale = new Fruit1("Pineapple", "Pineapple description",70);
	Fruit1 apple = new Fruit1("Apple", "Apple description",100);
	Fruit1 orange = new Fruit1("Orange", "Orange description",80);
	Fruit1 banana = new Fruit1("Banana", "Banana description",90);

	fruits[0]=pineappale;
	fruits[1]=apple;
	fruits[2]=orange;
	fruits[3]=banana;

	Arrays.sort(fruits);

	int i=0;
	for(Fruit1 temp: fruits){
	   System.out.println("fruits " + ++i + " : " + temp.getFruitName() +
		", Quantity : " + temp.getQuantity());
	}

}

}


 class Fruit1 implements Comparable<Fruit1>{

	private String fruitName;
	private String fruitDesc;
	private int quantity;

	public Fruit1(String fruitName, String fruitDesc, int quantity) {
		super();
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
	}

	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getFruitDesc() {
		return fruitDesc;
	}
	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int compareTo(Fruit1 compareFruit) {

		int compareQuantity = ((Fruit1) compareFruit).getQuantity();

		//ascending order
		return this.quantity - compareQuantity;

		//descending order
		//return compareQuantity - this.quantity;

	}

	public static Comparator<Fruit1> FruitNameComparator
                          = new Comparator<Fruit1>() {

	    public int compare(Fruit1 fruit1, Fruit1 fruit2) {

	      String fruitName1 = fruit1.getFruitName().toUpperCase();
	      String fruitName2 = fruit2.getFruitName().toUpperCase();

	      //ascending order
	      return fruitName1.compareTo(fruitName2);

	      //descending order
	      //return fruitName2.compareTo(fruitName1);
	    }

	};

	
}