package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveTests {
	@Test
	public void loginTest() {

		System.out.println(" Starting login test");
//      create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
		WebDriver driver = new ChromeDriver();

		// sleep for 3 seconds

		sleep();

		// maximise browser window
		driver.manage().window().maximize();
//		open test page
		String url = "http://the-internet.herokuapp.com/login";
		driver.get(url);
		System.out.println("Page is opened");

//		enter username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("tomsmith");

		sleep();
//		enter password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("SuperSecretPassword!");
//	
		sleep();
		// click login button
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();
		sleep();

//		verifications:

//			new url
		String expectedUrl ="http://the-internet.herokuapp.com/secure";
		String actualUrl=driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, expectedUrl,"actual page url is not same as expected");
		
//			logout button visible
		WebElement logout = driver.findElement(By.xpath("/html/body/div[2]/div/div/a"));
		Assert.assertTrue(logout.isDisplayed(), "logout button is not visible");
//			successfull login message
		WebElement successmessage = driver.findElement(By.cssSelector("#flash"));
		
		// close browser
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
