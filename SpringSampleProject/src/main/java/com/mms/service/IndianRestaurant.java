package com.mms.service;

import com.mms.dao.GrocessoriesSupplier;
import com.mms.dao.LabourSupplier;

public class IndianRestaurant implements Restaurant {
	
	private LabourSupplier labourSupplier;
	private GrocessoriesSupplier grocessoriesSupplier;

	public void foodItems() {
		
		System.out.println("this is from IndianRestaurant");
		
		/*labourSupplier = new LabourSupplier();*/
		labourSupplier.performTask();
		grocessoriesSupplier.performTask();

	}

	public LabourSupplier getLabourSupplier() {
		return labourSupplier;
	}

	public void setLabourSupplier(LabourSupplier labourSupplier) {
		this.labourSupplier = labourSupplier;
	}

	public GrocessoriesSupplier getGrocessoriesSupplier() {
		return grocessoriesSupplier;
	}

	public void setGrocessoriesSupplier(GrocessoriesSupplier grocessoriesSupplier) {
		this.grocessoriesSupplier = grocessoriesSupplier;
	}

}
