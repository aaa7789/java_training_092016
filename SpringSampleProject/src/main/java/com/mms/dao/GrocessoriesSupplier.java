package com.mms.dao;

import java.util.List;

public class GrocessoriesSupplier implements RestaurantHelper {
	
	private List<String> vegitables;
	
	public void performTask()
	{
		System.out.println("this is from GrocessoriesSupplier");
		
		for(String currVeg : vegitables)
		{
			System.out.println("current veggie is : " + currVeg);
		}
	}

	public List<String> getVegitables() {
		return vegitables;
	}

	public void setVegitables(List<String> vegitables) {
		this.vegitables = vegitables;
	}

}
