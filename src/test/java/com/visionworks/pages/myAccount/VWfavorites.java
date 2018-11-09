package com.visionworks.pages.myAccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visionworks.utilities.Driver;

public class VWfavorites {
	public VWfavorites() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(xpath = "(//*[contains(text(),'Favorites')])[3]")
	public WebElement favorites;
}
