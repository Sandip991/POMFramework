package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	//1. define private By loactor
	private By email = By.id("input-email");
	private By password = By.id("input-password");
	private By loginBtn = By.className("input-password");
	private By forgotPwdlink = By.xpath("(//a[text() =\"Forgotten Password\" ])[1]");
	
	//2. Create constructor 
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public String  getLoginPageTitle()
	{
		String pageTitle = driver.getTitle();
		System.out.println("logn page title is : " +pageTitle);
		return pageTitle;
	}
	
	public String  getLoginPageURL()
	{
		String url = driver.getCurrentUrl();
		System.out.println("logn page URL is : " +url);
		return url;
	}
	
	public boolean isForgotPwdExist()
	{
		boolean flag = driver.findElement(forgotPwdlink).isDisplayed();
		return flag;
	}
	
	public void doLogin(String un, String pwd)
	{
		
		driver.findElement(email).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginBtn).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
