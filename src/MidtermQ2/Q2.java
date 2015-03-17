package MidtermQ2;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import CISC181.Midterm1.MyClass;
public class Q2 {

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
	public boolean ReturnTrue() {
		assertTrue(true).returnTrue();
	}

	@Test
	public boolean AddTwoNumbers(int nbr1, int nbr2){
		int answer = nbr1 + nbr2;
		MyClass tester = new MyClass();
		assertEquals(nbr1 + "+" + nbr2 "is",answer, tester.add(nbr1,nbr2));
				
	}
	
}
