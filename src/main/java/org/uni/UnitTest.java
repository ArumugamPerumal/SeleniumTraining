package org.uni;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UnitTest {

	@Before
	public void startDate() {
		System.out.println("Test Case start Date and Time");

	}

	@After
	public void endDate() {
		System.out.println("Test Case end Date and Time");
	}

	@Test
	public void tc1() {
		System.out.println("Test Case 1");

	}

	@Test
	public void tc2() {
		System.out.println("Test Case 2");

	}

	@Test
	public void tc3() {
		System.out.println("Test Case 3");

	}

	@AfterClass
	public static void closetheBrowser() {
		System.out.println("Close the Browser....");

	}

	@BeforeClass
	public static void launchBrowser() {
		System.out.println("Browser Launching....");

	}

	@Test
	public void tc4() {
		System.out.println("Test Case 4 ");

	}

	@Test
	public void tc5() {
		System.out.println("Test Case 5");

	}

	@Test
	public void tc6() {
		System.out.println("Test Case 6");
	}

}
