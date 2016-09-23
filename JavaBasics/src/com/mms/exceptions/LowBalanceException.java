package com.mms.exceptions;

public class LowBalanceException extends Exception {
	
	private double amount;
	
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	private static final long serialVersionUID = 1L;

	public LowBalanceException(String msg)
	{
		super(msg);
	}
	
	public LowBalanceException(double amount)
	{
		this.amount = amount;
		
	}

}
