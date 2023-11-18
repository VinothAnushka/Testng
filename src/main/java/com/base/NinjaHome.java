package com.base;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NinjaHome extends Base{

	public NinjaHome() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "input-firstname" )
	private WebElement firtname;
	
	@FindBy(id = "input-lastname" )
	private WebElement lastname;
	
	@FindBy(id = "input-email" )
	private WebElement email;
	
	public WebElement getEmail() {
		return email;
	}
	public WebElement getFirtname() {
		return firtname;
	}
	public WebElement getLastname() {
		return lastname;
	}
}


