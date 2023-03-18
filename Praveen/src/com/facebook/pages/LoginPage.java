package com.facebook.pages;

import com.facebook.genericPage.MasterPage;

public class LoginPage extends MasterPage{
	public LoginPage() throws Exception {
		super();
	}
	//Click On Email/Phone
	public void clickEmailOrPhone() {
		click("EmailOrPhone");
	}
	//Enter username
	public void enterUsername() {
		enterData("EmailOrPhone","testData4");
	}
	//Click On Password
	public void clickPassword() {
		click("Password");
	}
	//Enter Password
	public void enterPassword() {
		enterData("Password","testData5");
	}
	
	//click on login button
	public void clickLoginButton() {
		click("LoginButton");
	}

}
