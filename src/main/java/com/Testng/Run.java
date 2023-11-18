package com.Testng;

import com.base.Base;
import com.base.Pomanager;

public class Run extends Base {


	Pomanager pom  = new Pomanager();
	
	private void executeBrowser() {
		browserLaunch("chrome");
	}
	
	private void aunchAmazon() {
		launchUrl("https://www.amazon.in/");
	}
	
	private void searchAProduct() {
//		inputValues(pom.getAmazonHome().getSearch(),"apple");
	}
}
