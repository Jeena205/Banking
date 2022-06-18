package com.Banking.testCases;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Banking.pageObjects.LoginPage;



public class TC_LoginTest_001 extends BaseClass
{
	@Test
   public void loginTest() throws IOException
   {
          //driver.get(baseurl);
          logger.info("Url is opened");
 
          //driver.findElement(By.id("details-button")).click();
          //driver.findElement(By.id("proceed-link")).click();
          
         // logger.info("found the driver element");
	     
	     LoginPage lp=new LoginPage(driver);
	        lp.setUsername(username);
	        logger.info("username entered");
	        lp.setPassword(password);
	        logger.info("password entered");
	        lp.clickSubmit();
	        
	        if(driver.getTitle().equals("Guru99 Bank Manager HomePage123"))
	        
	        {
	        	Assert.assertTrue(true);
	        	logger.info("Login test passed");
	        	System.out.println("titletrue");
	        }
	        else
	        {
	        	captureScreen(driver,"loginTest");
	        	Assert.assertTrue(false);
	        	logger.info("Login test failed");
	        	System.out.println("titlefalse");
	        }
   }
}
