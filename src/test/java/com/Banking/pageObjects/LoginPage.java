package com.Banking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement textUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement textpasswrd;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnlogin;

	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement btnlogout;
	public void setUsername (String uname)
	{
		textUserName.sendKeys(uname);
	}
	
	public void setPassword(String pword)
	
	{
		textpasswrd.sendKeys(pword);
	}
	public void clickSubmit()
	{
		btnlogin.click();
	}
	
	public void clickLogout()
	{
		btnlogout.click();
	}


}
