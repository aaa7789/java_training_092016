package com.mms.lambda;

public class Apple {
	private int id;
	private String color;
	private Integer weight;
	
	
	public Apple(int id,String color, int weight)
	{
		this.id = id;
		this.color = color;
		this.weight = weight;
	}
	
	public static boolean isGreenApple(Apple apple)
	{
		return "green".equals(apple.getColor());
	}
	
	public static boolean isHeavyApple(Apple apple)
	{
		return apple.getWeight() > 150;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Apple [id=" + id + ", color=" + color + ", weight=" + weight + "]";
	}

	
	
	

}
