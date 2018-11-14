package com.visionworks.pages.contactLenses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visionworks.utilities.Driver;

public class VWcontactLensesShopAll {
	public VWcontactLensesShopAll() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//a[@class='panel-title'][contains(text(),'PRODUCT TYPE')]")
	public WebElement productTypeDropDownButton;
	
	@FindBy(xpath = "//a[contains(@class,'checked')]")
	public WebElement contactLensCheckBox;
	
	@FindBy(xpath = "(//a[@class='checkbox-link '][1])[1]")
	public WebElement frameCheckBox;
	
	@FindBy(xpath = "(//*[contains(text(),'Clear')])[1]")
	public WebElement clearForProductTypeButton;
	
	@FindBy(xpath = "(//*[contains(text(),'BRAND')])[3]")
	public WebElement brandDropDownButton;
	
	
	
}
