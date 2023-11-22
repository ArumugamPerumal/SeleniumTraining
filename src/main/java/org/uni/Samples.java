package org.uni;

public class Samples extends Base {

	public static void main(String[] args) {
		LaunchBrowser();
		launchURL("https://en-gb.facebook.com/");
		windowMaximize();
		
		FbLoginPojo f = new FbLoginPojo();
		passText("Selenium", f.getVarRef());
		passText("Inmakes",f.getPassword());
		clickBtn(f.getLoginBtn());
		
		
		
	}
}
