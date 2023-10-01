package com.qa.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Xpath {
	WebDriver driver;
	@BeforeMethod
	public void launch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void Xpath()
	{
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("amit");
		
		//driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("amit");
		
		//driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("amit");
		
		
		
	}

}
