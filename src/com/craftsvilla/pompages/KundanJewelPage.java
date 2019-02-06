package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class KundanJewelPage extends BasePage{

	@FindBy(xpath = "//img[contains(@src,'35988-MCRAF28096166160-1528288226-Craftsvilla_1.jpg')")
	private WebElement product1;
	
	public KundanJewelPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void chooseProduct1()
	{
		verifyElementPresent(product1);
		product1.click();
	}
}
