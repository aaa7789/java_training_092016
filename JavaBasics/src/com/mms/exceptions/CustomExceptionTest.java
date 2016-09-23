package com.mms.exceptions;

public class CustomExceptionTest {

	public static void main(String[] args) {
		
		BankA bank = new BankA();
		bank.deposit(1000);
		
		try
		{
			  bank.withdraw(100);
			  System.out.println("withdrew $100 successfully");
			  bank.withdraw(500);
			  System.out.println("withdrew $500 successfully");
			  bank.withdraw(500);
			  System.out.println("withdrew $500 successfully");
			
		}
		catch(LowBalanceException exp)
		{
			System.out.println("exception occurred ........" + exp.getMessage());
			
			System.out.println("balance amount is less than withdrawal amount by: " + exp.getAmount());
		}
		
	}

}

class BankA
{
	double balance;
	
	public void deposit(double depAmount)
	{
		balance = depAmount;
	}
	
	public void withdraw(double withDrawAmount) throws LowBalanceException
	{
		
		
			if(balance > withDrawAmount)
			{
				balance = balance -withDrawAmount;
				System.out.println("withdrawing the amount from BankA: " + withDrawAmount);
			}else
			{
				throw new LowBalanceException(balance - withDrawAmount);
			}
		
		
	}
}
