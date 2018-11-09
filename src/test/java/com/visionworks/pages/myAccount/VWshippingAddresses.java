package com.visionworks.pages.myAccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visionworks.utilities.Driver;

public class VWshippingAddresses {
	public VWshippingAddresses(){
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(xpath = "//*[contains(text(),'Shipping Addresses')]")
	public WebElement shippingAddresses;
	
	@FindBy(xpath = "//*[contains(text(),'Manage Addresses')]")
	public WebElement manageAddresses;
	
	@FindBy(xpath = "//*[contains(text(),'ADD NEW ADDRESS')]")
	public WebElement addNewAddressButton;
	
	@FindBy (id = "firstName")
	public WebElement firstNameForShippingAddress;
	
	@FindBy (id = "midName")
	public WebElement middleNameForShippingAddress;
	
	@FindBy (id = "lastName")
	public WebElement lastNameForShippingAddress;
	
	@FindBy(xpath = "(//input[@name='phoneGroup'])[1]")
	public WebElement phoneFirstThreeDigitsForshippingAddresses;
	
	@FindBy(xpath = "(//input[@name='phoneGroup'])[2]")
	public WebElement phoneSecondThreeDigitsForshippingAddresses;
	
	@FindBy(xpath = "(//input[@name='phoneGroup'])[3]")
	public WebElement phoneLastFourDigitsForshippingAddresses;
	
	@FindBy (id = "address1")
	public WebElement addressForShippingAddress;
	
	@FindBy (id = "address2")
	public WebElement addressLine2ForShippingAddress;
	
	@FindBy (id = "city")
	public WebElement cityForShippingAddress;
	
	@FindBy (id = "state")
	public WebElement stateForShippingAddress;
	
	@FindBy (xpath = "//*[@id='state']/option[45]")
	public WebElement texasForShippingAddress;
	
	@FindBy (id = "zipCode")
	public WebElement zipCodeForShippingAddress;
	
	@FindBy(xpath = "//input[@name='checkbox']")
	public WebElement defaultShippingBox;
	
	@FindBy (id = "saveAddressBookBtn")
	public WebElement saveAddressBookButtonForShippingAddress;
	
	@FindBy (xpath = "(//*[@id='main-container']/div[2]/div/section/p/text())[2]")
	public WebElement confirmationTextForShippingAddress;
	
	
	@FindBy(xpath = "(//*[contains(text(),'CANCEL')])[2]")
	public WebElement cancelButtonForShippingAddress;
	
	@FindBy(xpath = "(//*[contains(text(),'Delete')])[1]")
    public WebElement deleteButton;
	
	@FindBy(xpath = "(//*[contains(text(),'Edit')])[1]")
    public WebElement editButton;
    
    @FindBy(xpath = "(//*[contains(text(),'DELETE')])[2]")
    public WebElement deleteButtonUnderAreYouSureToDeleteThisAddress;

	
	
}
