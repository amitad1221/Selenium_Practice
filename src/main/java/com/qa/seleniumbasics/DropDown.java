package com.qa.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDown {
	WebDriver driver;
	@BeforeMethod
	public void launch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://formstone.it/components/dropdown/demo/");
	}
	
	@Test
	public void dropDown()
	{
		Select drpCountry = new Select(driver.findElement(By.id("demo_basic-dropdown-selected")));
		drpCountry.selectByVisibleText("Two");
		
		
	}
	
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}

}
