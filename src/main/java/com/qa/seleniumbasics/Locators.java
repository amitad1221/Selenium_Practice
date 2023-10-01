package com.qa.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Locators {
	WebDriver driver;
	@BeforeMethod
	public void launch() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test
	public void locators()
	{
		//driver.findElement(By.id("username")).sendKeys("ok");//-1
		//driver.findElement(By.name("username")).sendKeys("ok");//-2
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("ok");//-3
		//driver.findElement(By.tagName("input")).sendKeys("ok");;//-4
		//driver.findElement(By.linkText("OrangeHRM")).sendKeys("ok");//-5
		//driver.findElement(By.partialLinkText(""));//-6
		//driver.findElement(By.xpath(""));//-7
		//driver.findElement(By.cssSelector("input#username")).sendKeys("ok");//-8  
		//driver.findElement(By.cssSelector("input[name=username]")).sendKeys("ok");
		//driver.findElement(By.cssSelector("")).sendKeys("ok");
		
	}

}
