package base;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("unused")
public class Main_Test {
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
	public void Test_Total_Cost1() {
		double expectedValue = (double) 100164.18362699999;
		double actualValue = Main.Total_Cost(12520, 3);
		assertTrue(expectedValue == actualValue);
	}
	
	@Test
	public void Test_Total_Cost2() {
		double expectedValue = (double) 999932.1836270001;
		double actualValue = Main.Total_Cost(124991, 3);;
		assertTrue(expectedValue == actualValue);
	}
	
	@Test
	public void Test_Monthly_Payment1() {
		double expectedValue = (double) 305.13810773333336;
		double actualValue = Main.monthly_payment(12520, 4, 4);
		assertTrue(expectedValue == actualValue);
	}
	
	@Test
	public void Test_Monthly_Payment2() {
		double expectedValue = (double) 164.13670145833336;
		double actualValue = Main.monthly_payment(7000, 3, 4);
		assertTrue(expectedValue == actualValue);
	}
}