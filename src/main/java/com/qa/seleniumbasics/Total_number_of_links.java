package com.qa.seleniumbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Total_number_of_links {
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
	public void numerOfLinks()
	{
		List <WebElement> elements=driver.findElements(By.tagName("a"));
		System.out.println(elements.size());
		
		for(int i=0; i<elements.size(); i++)
		{
			String text=elements.get(i).getText();
			System.out.println(text);
			
		}
		
	}

}
