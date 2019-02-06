package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class ProductDetailsPage extends BasePage {

	@FindBy(id = "buynow")
	private WebElement buynow;
	
	public ProductDetailsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnBuyNow()
	{
		verifyElementPresent(buynow);
		buynow.click();
	}
}
