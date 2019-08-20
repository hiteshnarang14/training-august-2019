package com.amdocs;

public class SavingsAccount {
	
	public double getBalance() {
		System.out.println("From DB");
		return 7000.0;
	}
	
	public double withdraw(double amountToBeWithdrawn) throws InsufficientBalanceException{
		System.out.println("Insidse Withdraw Method");
		
		double currentBalance = getBalance();
		
		if(amountToBeWithdrawn<currentBalance) {
			currentBalance = currentBalance-amountToBeWithdrawn;
		}
		else
			throw new InsufficientBalanceException();
		
		updateBalanceDB(currentBalance);
		
		return currentBalance;
	}
	
	public void updateBalanceDB(double currentBalance) {
		System.out.println("Updated in DB");
	}

}
