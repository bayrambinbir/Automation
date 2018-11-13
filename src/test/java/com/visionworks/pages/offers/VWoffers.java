package com.visionworks.pages.offers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visionworks.utilities.Driver;

public class VWoffers {
	public VWoffers() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(xpath = "(//*[contains(text(),'OFFERS')])[1]")
	public WebElement offersTab;
	
	@FindBy(xpath = "//input[@name = 'address'][@aria-label = 'ENTER ZIP CODE']")
	public WebElement enterZipCodeUnderOffers;
	
	@FindBy(xpath = "//button[@type = 'submit'][@class = 'go_button']")
	public WebElement goButtonUnderOffers;
	
	@FindBy(id = "inputSubscription")
	public WebElement emailForPromotionsUnderOffers;
	
	@FindBy(xpath = "//button[@type = 'submit'][contains(text(), 'GO')][@class = 'btn btn-lg btn-primary']")
	public WebElement goButtonForPromotionsUnderOffers;
}
