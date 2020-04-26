package com.herokuapp.theinternet;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class NegativeTests {
	
	public void incorrectUsername() {
		

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		String url = "http://the-internet.herokuapp.com/login";
		driver.get(url);
		System.out.println("Page is opened");


		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("incorrect");
		

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("SuperSecretPassword!");
		
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();
		
	//	Verifications:
		
		WebElement errormessage = driver.findElement(By.id("flash"));

		//String actualErrormessage = errormessage.getText();
		String expectedErrormessage="Your username is invalid!\n" + 
				"×";
		
		//Assert.assertTrue(condition);
		//Assert.assertT
		Assert.assertEquals(errormessage.getText(), expectedErrormessage);
		//Assert.assertEquals(actualErrormessage, expectedErrormessage, "actual does not match expected");
		// close browser
		driver.quit();

		
	}

}
