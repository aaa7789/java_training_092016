package com.mms.exceptions.classwork;

public class UserDefinedExceptionTest {

	public static void main(String[] args) {
		
		
		BankA bank = new BankA();
		
		bank.deposit(1000);
	
		try
		{
			bank.withDraw(200);
			System.out.println("succefully withdrew 200 dollars");
			
			bank.withDraw(300);
			System.out.println("succefully withdrew 300 dollars");
			bank.withDraw(800);
			System.out.println("succefully withdrew 800 dollars");
			
		}
		catch(LowBalanceException exp)
		{
			System.out.println("your balance amount is: " + exp.getAmount() + "less than your withdrawal request");
		}
		

	}

}


class BankA
{
	double balance;
	
	public void deposit(double amount)
	{
		balance = amount;
	}
	
	public void withDraw(double withDrawAmount) throws LowBalanceException
	{
		if(balance > withDrawAmount)
		{
			 balance = balance - withDrawAmount;
			//System.out.println("succeffully withdraw amount " + withDrawAmount);
		}
		else
		{
			throw new LowBalanceException(balance - withDrawAmount);
		}
	}
}