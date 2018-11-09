package com.visionworks.pages.FindAStore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visionworks.utilities.Driver;

public class VWfindAstore {

	public VWfindAstore() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy (xpath = "(//input[@name='address'])[1]")
	public WebElement enterCityStateOrZipCode;
	
	@FindBy(xpath = "(//*[contains(text(),'FIND')])[2]")
	public WebElement findButton;
	
	@FindBy(xpath = "(//*[contains(text(),'See Nearby Stores')])[1]")
	public WebElement seaNearbyStores;
}
