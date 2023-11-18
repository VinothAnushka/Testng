package com.test;

import org.junit.Test;

import com.base.Base;
import com.base.Pomanager;

public class TestRun extends Base{
	Pomanager pom  = new Pomanager();
	
	@Test(priority = 1)
	private void executeBrowser() {
		browserLaunch("chrome");
	}
	
	@Test(priority = 2)
	private void aunchAmazon() {
		launchUrl("https://www.amazon.in/");
	}

}
