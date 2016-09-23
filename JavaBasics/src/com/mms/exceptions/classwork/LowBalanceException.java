package com.mms.exceptions.classwork;

public class LowBalanceException extends Exception {
	
	private double amount;
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LowBalanceException(double amount)
	{
		this.amount = amount;
	}
	
	public LowBalanceException(String msg)
	{
		super(msg);
	}

}
