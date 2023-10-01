package com.qa.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Launch_url {
	WebDriver driver;
	
	@BeforeMethod
	public void launch()
	{
		//System.setProperty("webdriver.chrome.driver","");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test
	public void googletitleTest()
	{
		System.out.println("google");
	}
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}

}
