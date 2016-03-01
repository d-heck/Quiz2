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
		float expectedValue = (float) 111828.64;
		float actualValue = Main.Total_Cost(12520, 3, 4, 4);
		System.out.println(actualValue);
		assertTrue(expectedValue == actualValue);
	}
	@Test
	public void Test_Total_Cost2() {
		float expectedValue = (float) 130823.695;
		float actualValue = Main.Total_Cost(12520, 3, 4, 8);
		System.out.println(actualValue);
		assertTrue(expectedValue == actualValue);
	}
	@Test
	public void Test_Monthly_Payment1() {
		float expectedValue = (float) 2329.7634;
		float actualValue = Main.monthly_payment((float)111828.64,(float) 4);
		System.out.println(actualValue);
		assertTrue(expectedValue == actualValue);
	}
	@Test
	public void Test_Monthly_Payment2() {
		float expectedValue = (float) 1362.747;
		float actualValue = Main.monthly_payment((float)130823.70, (float)8);
		System.out.println(actualValue);
		assertTrue(expectedValue == actualValue);
	}
}