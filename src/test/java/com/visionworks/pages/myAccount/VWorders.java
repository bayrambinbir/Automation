package com.visionworks.pages.myAccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visionworks.utilities.Driver;

public class VWorders {

	public VWorders() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "(//*[contains(text(),'Orders')])[2]")
	public WebElement orders;
	
	@FindBy(xpath = "//*[contains(text(),'Manage Orders')]")
	public WebElement manageOrders;
}
