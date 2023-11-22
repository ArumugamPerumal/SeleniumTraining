package org.uni;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;



public class Sample extends Base{
	
	@Before
	public void startDate() {
		Date d = new Date();
		System.out.println(d);

	}

	@After
	public void endDate() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	public void tc1() {
		System.out.println("Test case 1:");
		launchURL("https://www.youtube.com/");

	}

	@Test
	public void tc2() {
		System.out.println("Test case 2:");
		launchURL("https://en-gb.facebook.com/");
		String title = pageTitle();
		String url = pageUrl();
		FbLoginPojo f = new FbLoginPojo();
		passText("Selenium",f.getVarRef());
		Assert.assertEquals("Check your url", url, url.contains("facebook"));
		
		passText("arumugam", f.getPassword());

	}

	@Test
	public void tc3() {
		System.out.println("Test case 3:");
		launchURL("https://www.inmakes.com/");

	}

	@AfterClass
	public static void closetheBrowser() {
		//closeEntireBrowser ();

	}

	@BeforeClass
	public static void launchBrowser() {
		LaunchBrowser();
		windowMaximize();

	}

	@Test
	public void tc4() {
		System.out.println("Test case 4:");
		launchURL("https://accounts.google.com/signin/v2/challenge/pwd?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=AVQVeyxn0yw73S_PUVNJ1w213YfHyIrJY9c-7_JaEImhsH-yRUSkJqqdPd749ZUcZRqKq-p_-O3g3g&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&navigationDirection=forward&TL=AIBe4_LIP9xwcz44GiVAZW9oZFzo_TpSd2m05Sv0eZEcFnGUlfwHxGvvB0-n_11F");

	}
    @Ignore
	@Test
	public void tc5() {
		System.out.println("Test case 5:");

	}
    @Ignore
	@Test
	public void tc6() {
		System.out.println("Test case 6:");
	}

}


