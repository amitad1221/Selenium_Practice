package com.qa.seleniumbasics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IsDisplayed {
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
	public void elementVisibility() 
	{
		boolean b1=driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		System.out.println(b1);
		
		boolean b2=driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		System.out.println(b2);
		
		boolean b3=driver.findElement(By.xpath("//button[@type='submit']")).isSelected();
		System.out.println(b3);
		
		
		
		
	}
		

}
