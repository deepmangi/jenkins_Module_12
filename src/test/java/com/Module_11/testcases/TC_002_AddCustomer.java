package com.Module_11.testcases;
import com.Module_11.utilities.*;
import java.util.Hashtable;

import org.testng.annotations.Test;

import com.Module_11.base.BaseTest;

public class TC_002_AddCustomer extends BaseTest{

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bankManagerDP")
	public void addCustomerTest(Hashtable<String,String> data) {

		//adding comments
		ExcelReader excel = new ExcelReader(Constants.SUITE1_XL_PATH);
		DataUtil.checkExecution("BankManagerSuite", "AddCustomerTest", data.get("Runmode"), excel);
		browser = getBrowser(data.get("browser"));
		navigate(browser, Constants.URL);
		click("bmlBtn_CSS");
		click("addCustBtn_CSS");
		type("firstname_CSS", data.get("firstname"));
		type("lastname_XPATH", data.get("lastname"));
		type("postcode_CSS", data.get("postcode"));
		click("addbtn_CSS");
	
	}
}
