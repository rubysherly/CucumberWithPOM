package com.stepdefinition;


import baseclass.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base {

	@Before
	public static void beforeMethod() {
		getDriver();
		loadUrl("http://demo.guru99.com/telecom/index.html");

	}

	@After
	public static void afterMethod() {
		closeBrowser();
		quitBrowser();
	}
}
