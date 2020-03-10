package com.testsuite.smoke;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePageTest 
{
	WebDriver driver;
	
	//@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://phptravels.net");
	}

	//@BeforeMethod
	public void selectcurrenyAndValidateisSetToTheSelectedCurreny()
	{
		driver.findElement(By.id("dropdownCurrency")).click();
		WebElement dropDown = driver.findElement(By.id("dropdownCurrency"));
		Select mySelect = new Select(dropDown);
		mySelect.selectByVisibleText("INR");
		
		
	}
	
	@Test
	public void signUp()
	{
		Assert.assertEquals(true, true);
	}
	
		
}
