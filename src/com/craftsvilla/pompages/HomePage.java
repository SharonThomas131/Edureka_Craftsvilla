package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class HomePage extends BasePage{
	
	//LIKEWISE IDENTIFY every element  in the webpage, using any locators u  wish
	@FindBy(xpath = "//a[text()='JEWELRY ']")
	private WebElement jewelry;    //can be smallcase also.
	
	@FindBy(xpath = "//a[text()='SAREES']")
	private WebElement sarees;
	
	@FindBy(xpath = "//a[contains(text(),'KURTIS ')]")
	private WebElement kurtisdresses;
	
	@FindBy(xpath = "//a[contains(text(),'SALWAR ')]")
	private WebElement salwarsuits;
	
	public HomePage(WebDriver driver)
	{
		super(driver);   //call the super class constructor. MUST call in inheritence.
		PageFactory.initElements(driver, this);
	}
	
	public void goToAccessories()
	{
		mouseHover(driver, jewelry);
	}
}
