package com.visionworks.pages.contactLenses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visionworks.utilities.Driver;

public class VWcontactLensesShopByBrand {

	public VWcontactLensesShopByBrand() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(xpath = "//*[contains(text(),'CONTACT LENSES')]")
	public WebElement contactLensesTab;
	
	@FindBy(xpath = "(//a[@class='thumbnail'] [contains(@href,'/acuvue')])[1]")
	public WebElement acuvueUnderContactLenses;
	
	@FindBy(xpath = "(//a[@class='thumbnail'] [contains(@href,'/air-optix')])[1]")
	public WebElement airOptixUnderContactLenses;
	
	@FindBy(xpath = "(//a[@class='thumbnail'] [contains(@href,'/aquatech')])[1]")
	public WebElement aquaTechUnderContactLenses;
	
	@FindBy(xpath = "(//a[@class='thumbnail'] [contains(@href,'/dailies')])[1]")
	public WebElement dailiesUnderContactLenses;
	
	@FindBy(xpath = "(//a[@class='thumbnail'] [contains(@href,'/proclear')])[1]")
	public WebElement proClearUnderContactLenses;
	
	@FindBy(xpath = "(//a[@class='thumbnail'] [contains(@href,'/purevision')])[1]")
	public WebElement pureVisionUnderContactLenses;
	
	

	
}
