package com.amdocs;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class SavingsAccountTest {
	
	private SavingsAccount account;
	private SavingsAccount accountSpy;
	
	@Before
	public void setup() {
		account = new SavingsAccount();
		accountSpy = spy(account);
	}
	
	@After
	public void tearDown() {
		account = null;
		accountSpy = null;
	}
	
	@Test
	public void testWithdrawWhenCurrentBalanceIs5000INR() throws InsufficientBalanceException {
		
		
		doReturn(5000.0).when(accountSpy).getBalance();
		doNothing().when(accountSpy).updateBalanceDB(anyDouble());
		
		double updatedBalance = accountSpy.withdraw(1000.0);
		double expectedBalance = 4000.0;
		
		assertEquals(expectedBalance, updatedBalance, 0.0001);
		
		verify(accountSpy,times(1)).getBalance();
		verify(accountSpy,times(1)).updateBalanceDB(anyDouble());
	}
	
	
	@Ignore
	@Test
	public void testWithdrawWhenCurrentBalanceIsInsufficient() {
		
		boolean exceptionThrown = false;
		
		doReturn(5000.0).when(accountSpy).getBalance();
		doNothing().when(accountSpy).updateBalanceDB(anyDouble());
		
		try{
			accountSpy.withdraw(6000.0);
		}
		catch(InsufficientBalanceException e) {
			exceptionThrown = true;
		}
		
		boolean expectedException = true;
		
		assertEquals(expectedException, exceptionThrown);
		
		verify(accountSpy,times(1)).getBalance();
		verify(accountSpy,times(0)).updateBalanceDB(anyDouble());
	}

}
