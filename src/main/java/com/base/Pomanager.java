package com.base;

import org.openqa.selenium.support.PageFactory;

public class Pomanager extends Base {
	public Pomanager() {
		PageFactory.initElements(driver, this);
	}
	
	private NinjaHome ninjaHome;
	
	public NinjaHome getNinjaHome() {
		ninjaHome=new NinjaHome();
		return ninjaHome;
	}
}
