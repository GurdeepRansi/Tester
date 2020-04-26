package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExceptionTests {
	@Test
	public void notvisibletest()
	{
//  create driver
	System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
	WebDriver driver = new ChromeDriver();


	driver.manage().window().maximize();
	
	sleep();
//	open test page
	String url = "http://the-internet.herokuapp.com/dynamic_loading/1";
	driver.get(url);
	System.out.println("Page is opened");
	sleep();
	
	WebElement startbutton= driver.findElement(By.id("start"));
	startbutton.click();
	
	
	
	WebElement successmsg=driver.findElement(By.id("finish"));
	
	WebDriverWait wait= new WebDriverWait(driver, 10);
	
	wait.until(ExpectedConditions.visibilityOf(successmsg));
	
	String expectedmsg= "Hello World!";
			
	Assert.assertEquals(successmsg.getText(), expectedmsg);
	//sleep();
	driver.quit();
	
	}
	
	private void sleep() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	
	}
	
}
}
