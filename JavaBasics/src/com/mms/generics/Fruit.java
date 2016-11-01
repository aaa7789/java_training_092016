package com.mms.generics;

public class Fruit {
	private int fruitId;
	private String fruitName;
	
	public Fruit(int id, String name)
	{
		fruitId = id;
		fruitName = name;
	}
	
	public int getFruitId() {
		return fruitId;
	}
	public void setFruitId(int fruitId) {
		this.fruitId = fruitId;
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	@Override
	public String toString() {
		return "Fruit [fruitId=" + fruitId + ", fruitName=" + fruitName + "]";
	}

}
