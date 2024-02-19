package com.calssname;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class lunchingchromeTest {
	
public String baseurl ="https://www.amazon.in";
	
	String driverPath = "E:\\\\SeleniumDec23batch\\\\chromedriver.exe";
	
	public WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() 
	{
		
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
	
	
	@Test
	public void verifyHomepageTitle() 
	{
		System.out.println("launching Chrome browser");
		String expectedTitle = "Online Shopping site in India: shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
	
	}
	
	@AfterTest
	public void terminateBrowser()
	{
		driver.close();
		
	}
	

}
