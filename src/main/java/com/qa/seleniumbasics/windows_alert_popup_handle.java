package com.qa.seleniumbasics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class windows_alert_popup_handle {
	WebDriver driver;
	@BeforeMethod
	public void launch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("");
	}
	
	@Test
	public void alterHandle() throws InterruptedException
	{
		driver.findElement(By.xpath("")).click();
		
		Thread.sleep(4000);
		
		Set<String> handler=driver.getWindowHandles();
		
		Iterator<String> it=handler.iterator();
		
		String parentWindowId=it.next();
		System.out.println("parent window id:"+ parentWindowId);
		
		String childWindowId=it.next();
		System.out.println("child window id:"+ childWindowId);
		
		driver.switchTo().window(childWindowId);
		
		Thread.sleep(4000);
		
		System.out.println("child window pop up title:"+ driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		Thread.sleep(4000);
		
		System.out.println("parent window title:"+ driver.getTitle());
		
		
		
		
		
		
		
		
	}
		

}
