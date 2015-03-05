import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import src.InsufficientFundsException;
import Set3.Account;

public class AccountTest {

	Account test;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void Accounttest() throws Set3.InsufficientFundsException  {
		double TestResult=0;
		double MonthlyInterestResult=0;
		Account.setAnnualInterestRate(0.045);
		Account.withdraw(2500);
		TestResult= Account.deposit(3000);
		MonthlyInterestResult = Account.getMonthlyInterestRate();
		System.out.printf("The balance is" , Account.getBalance());
		System.out.println("The monthly interest  is "+(Account.getMonthlyInterestRate()*100));
		System.out.println("created on "+ Account.getDateCreated());
		//check that the amount withdrawn is what it is supposed to be
		assertEquals(20500,TestResult,0);
		assertEquals(.00375,MonthlyInterestResult, .001);
	}
	@Test 
	public final void Withdrawtest() throws Set3.InsufficientFundsException{
		boolean overdrawn = false;
		try {
			Account.withdraw(40000.00);}
		catch (Set3.InsufficientFundsException e) {overdrawn=true;}
		assertEquals (overdrawn, true);
	}

}
