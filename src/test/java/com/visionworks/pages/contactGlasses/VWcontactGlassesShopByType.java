package com.visionworks.pages.contactGlasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visionworks.utilities.Driver;

public class VWcontactGlassesShopByType {

	public VWcontactGlassesShopByType() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(xpath = "//a[@class='text-inverted'] [contains(text(),'2 Week')]")
	public WebElement twoWeekUnderContactLenses;
	
	@FindBy(xpath = "//a[@class='text-inverted'] [contains(text(),'Color')]")
	public WebElement colorUnderContactLenses;
	
	@FindBy(xpath = "//a[@class='text-inverted'] [contains(text(),'Daily')]")
	public WebElement dailyUnderContactLenses;
	
	@FindBy(xpath = "//a[@class='text-inverted'] [contains(text(),'Monthly')]")
	public WebElement monthlyUnderContactLenses;
	

}
