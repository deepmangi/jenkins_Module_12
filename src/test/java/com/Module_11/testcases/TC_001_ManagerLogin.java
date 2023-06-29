package com.Module_11.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.Module_11.base.BaseTest;
import com.microsoft.playwright.Browser;

public class TC_001_ManagerLogin extends BaseTest {

	@Test
	public void loginAsBankManager() throws InterruptedException {
		
		Browser browser = getBrowser("chrome");
		navigate(browser,"https://www.way2automation.com/angularjs-protractor/banking/#/login");
		click("bmlBtn_CSS");
		Thread.sleep(3000);

		System.out.println(isElementPresent("addCustBtn_CSS"));
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent("addCustBtn_CSS"),"");
		Thread.sleep(3000);

		
	}

}
