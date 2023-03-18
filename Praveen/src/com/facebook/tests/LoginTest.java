package com.facebook.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.facebook.genericPage.MasterPage;
import com.facebook.pages.LoginPage;

public class LoginTest {
	@Test
	public void loginTest() throws Exception {
		LoginPage Lp = new LoginPage();
		Lp.clickEmailOrPhone();
		Lp.enterUsername();
		Lp.clickPassword();
		Lp.enterPassword();
		Lp.clickLoginButton();
		Thread.sleep(6000);
	}
	
	@AfterClass
	public static void closeLoginPage() {
		MasterPage.driver.close();
	}

}
