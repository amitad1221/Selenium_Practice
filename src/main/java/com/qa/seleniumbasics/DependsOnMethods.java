package com.qa.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnMethods {
	WebDriver driver;
	
	@BeforeMethod
	
	public void launch()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		
	}
	
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(dependsOnMethods="test1")
	public void test2()
	{
		System.out.println("");
	}
	

}
