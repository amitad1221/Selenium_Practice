package com.qa.seleniumbasics;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assert {
	WebDriver driver;
	
	@BeforeMethod
	public void launch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test
	public void assertE()
	{
		String title=driver.getTitle();
		//assert.AssertEquals("google", title);
	}
	
	@Test
	public void assertT()
	{
		boolean b=driver.findElement(By.id("")).isDisplayed();
		//assert.assertTrue(b);
	}

}
