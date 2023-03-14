package com.qa.opencart.tests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class LoginPageTest extends BaseTest {
	
	@Test
	public void loginPageTitleTest()
	{
		String actualTitle = loginPage.getLoginPageTitle();
		Assert.assertEquals(actualTitle, "Account Login");
	}
	
	@Test
	public void loginPageURLTest()
	{
		String actualURL = loginPage.getLoginPageURL();
		Assert.assertTrue(actualURL.contains("route=account/login"));
	}
	
	@Test
	public void forgotPwdLinkExistTest()
	{
		Assert.assertTrue(loginPage.isForgotPwdExist());
	}
	
	
	@Test
	public void loginTest()
	{
		
		loginPage.doLogin("sandip@gmail.com", "test@123");
	}
	
	
	

}
