package com.craftsvilla.testscripts;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.pompages.HomePage;
import com.craftsvilla.pompages.JewelryPage;
import com.craftsvilla.pompages.KundanJewelPage;
import com.craftsvilla.pompages.ProductDetailsPage;

public class AccessoriesModuleScript extends BaseTest{


	HomePage hp = null;
	JewelryPage jp = null;
	KundanJewelPage kp = null;
	ProductDetailsPage pdp = null;
	
	public void buyKundanJewelry()
	{
		hp = new HomePage(driver);
		jp = new JewelryPage(driver);
		kp =new KundanJewelPage(driver);
		pdp = new ProductDetailsPage(driver);
		
		hp.goToAccessories();
		jp.goToKundanJewelry();
		kp.chooseProduct1();
		pdp.clickOnBuyNow();
	}
}
