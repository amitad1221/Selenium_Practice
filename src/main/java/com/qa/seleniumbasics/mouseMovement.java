package com.qa.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class mouseMovement {
WebDriver driver;
	
	@BeforeMethod
	public void launch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("");
	}
	
	@Test
	public void mouseMovement1() throws InterruptedException
	{
		Actions action= new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath(""))).build().perform(); //it will move the mouse cursor on to a specific element
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("")).click();
	}

}
