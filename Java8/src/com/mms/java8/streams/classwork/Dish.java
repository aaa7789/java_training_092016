package com.mms.java8.streams.classwork;

public class Dish  implements Comparable<Dish>{
	private String name;
	private boolean isVeggie;
	private int colories;
	private String type;
	
	public Dish(String name, boolean isVeggie, int colories, String type)
	{
		this.name = name;
		this.isVeggie = isVeggie;
		this.colories = colories;
		this.type = type;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVeggie() {
		return isVeggie;
	}

	public void setVeggie(boolean isVeggie) {
		this.isVeggie = isVeggie;
	}

	public int getColories() {
		return colories;
	}

	public void setColories(int colories) {
		this.colories = colories;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Dish [name=" + name + ", isVeggie=" + isVeggie + ", colories=" + colories + ", type=" + type + "]";
	}

	@Override
	public int compareTo(Dish o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
