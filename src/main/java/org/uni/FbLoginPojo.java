package org.uni;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojo extends Base {
	
	public FbLoginPojo() {
		PageFactory.initElements(driver,this);
	}
	
	@FindAll({
		@FindBy(xpath="//input[@id='email']"),
		@FindBy(xpath="//input[@name='email']"),
		@FindBy(xpath="//input(@data-testid='royal_email']")
		
	})
	
	private WebElement varRef;
	
	
	
	//@FindBy(id="email")
	//private WebElement email;
	

	@FindBy(xpath="//input[@aria-label='Password']")
    private WebElement password;
    
    @FindBy(name="login")
    private WebElement loginBtn;
    
    public WebElement getVarRef() {
    	return varRef;
    }
    public WebElement getPassword() {
    	return password;
    }
    public WebElement getLoginBtn() {
    	return loginBtn;
    }
	public WebElement getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
