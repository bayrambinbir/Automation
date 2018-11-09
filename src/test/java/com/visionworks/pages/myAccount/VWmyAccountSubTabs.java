package com.visionworks.pages.myAccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visionworks.utilities.Driver;

public class VWmyAccountSubTabs {
	public VWmyAccountSubTabs() {
		PageFactory.initElements(Driver.getDriver(), this);
	}	
	@FindBy (xpath = "//*[contains(text(),'Sign Out')]")
	public WebElement signOut;
	
	@FindBy(xpath = "(//*[contains(text(),'My Account')])[2]")
	public WebElement myAccountSubTab;
	
	@FindBy(xpath = "//*[contains(text(),'Order History')]")
	public WebElement orderHistorySubTab;
	
	@FindBy(xpath = "//*[contains(text(),'My Prescriptions')]")
	public WebElement myPrescriptionsSubTab;
	
	@FindBy(xpath = "//*[@id=\"main-toolbar\"]/li[6]/ul/li[5]/a")
	public WebElement myFavoritesSubTab;
	
	

}
