package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class JewelryPage extends BasePage{
	
	@FindBy(linkText = "Kundan Jewelry")
	private WebElement kundan;
	
	@FindBy(linkText = "Necklaces" )
	private WebElement necklaces;

	public JewelryPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void goToKundanJewelry()
	{
		verifyElementPresent(kundan);
		kundan.click();
	}

	
	
}
