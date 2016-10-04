package com.mms.lambda.classwork;

public class Apple {
	private String color;
	private int weight;
	private String type;
	private int number;
	
	public Apple(String color, int weight, String type, int number)
	{
		this.color = color;
		this.weight = weight;
		this.type = type;
		this.number = number;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + ", type=" + type + ", number=" + number + "]";
	}
	
	
	

}
