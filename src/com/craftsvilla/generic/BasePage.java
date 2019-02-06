package com.craftsvilla.generic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	
	public WebDriver driver = null;
	
	protected BasePage(WebDriver driver)  //or public
	{
		this.driver = driver;
	}
	
	public void verifyTitle(String exp_title)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.titleContains(exp_title));
			String title = driver.getTitle();
			Assert.assertEquals(title, exp_title);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Reporter.log("Fail",true);
		}
	}
	
	public void verifyElementPresent(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(ele));
			Reporter.log("Element present",true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Reporter.log("Fail",true);
		}
	}
	
	public void mouseHover(WebDriver driver, WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		try
		{
			Actions act = new Actions(driver);
			act.moveToElement(ele).perform();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Reporter.log("Fail",true);
		}
	}
	
	public void handleDropDown(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		try
		{
			Select sel = new Select(ele);
			sel.selectByIndex(0);  
			Reporter.log("First option selected",true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Reporter.log("Fail",true);
		}
	}
	
	public void handleAlerts(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		try
		{
			Alert alert = driver.switchTo().alert();
			alert.accept();
			Reporter.log("Alert accepted",true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Reporter.log("Fail",true);
		}
	}
}
