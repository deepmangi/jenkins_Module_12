package com.Module_11.rough;

import org.testng.annotations.Test;

import com.Module_11.base.BaseTest;
import com.microsoft.playwright.Browser;

public class TC_001_Rough extends BaseTest{
	@Test
	public void doLogin() throws InterruptedException {
		Browser browser = getBrowser("chrome");
		navigate(browser, "https://tutorial.dev.radixweb.net/login");
		type("username","divyarajbhanushali@gmail.com");
		type("password","divyaraj#143");
		Thread.sleep(1000);
		click("loginBtn");
		Thread.sleep(2000);
		click("text");
		select("id","/mylearning");

	}
	
}
