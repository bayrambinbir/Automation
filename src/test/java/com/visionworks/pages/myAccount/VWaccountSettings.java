package com.visionworks.pages.myAccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visionworks.utilities.Driver;

public class VWaccountSettings {
 
	public VWaccountSettings() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(xpath = "(//*[contains(text(),'Account Settings')])[1]")
	public WebElement accountSettings;
	
	@FindBy(xpath = "(//*[contains(text(),'Account Settings')])[2]")
	public WebElement manageAccountSettings;
	
	@FindBy (id = "firstName")
	public WebElement firstNameInAccountSettings;
	
	@FindBy (id = "lastName")
	public WebElement lastNameInAccountSettings;
	
	@FindBy (id = "email")
	public WebElement emailInAccountSettings;
	
	@FindBy (id = "checkbox-changePwd")
	public WebElement changePasswordBox;
	
	@FindBy (id = "currentPassword")
	public WebElement currentPassword;
	
	@FindBy (id = "newPassword")
	public WebElement createNewPassword;
	
	@FindBy (id = "confirmNewPassword")
	public WebElement confirmNewPassword;
	
	@FindBy(xpath = "//input[@type=\"submit\"]")
	public WebElement saveButtonInAccountSettings;
	
	@FindBy(xpath = "//*[@id=\"personalInfoForm\"]/P")
	public WebElement confirmationForPasswordChange;
	
	
	
}
