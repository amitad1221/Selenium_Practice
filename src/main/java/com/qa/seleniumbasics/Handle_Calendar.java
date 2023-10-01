package com.qa.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Calendar {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		
		//Thread.sleep(5000);
		
        Alert a=driver.switchTo().alert();
		a.dismiss();
		
		WebElement date=driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[2]"));
		String dateValue="Sun, 10 Sep 2023";
		
		selectDateByJS(driver, date, dateValue);

	}
	
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateValue)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value', '"+dateValue+"');", element);
	}

}
