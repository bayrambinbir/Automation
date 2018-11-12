package com.visionworks.pages.myAccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visionworks.utilities.Driver;

public class VWmyFavorites {
	public VWmyFavorites() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(xpath = "(//*[contains(text(),'Favorites')])[1]")
	public WebElement favorites;
}
