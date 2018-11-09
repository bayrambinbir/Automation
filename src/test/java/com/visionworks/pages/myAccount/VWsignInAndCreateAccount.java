package com.visionworks.pages.myAccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visionworks.utilities.Driver;

public class VWsignInAndCreateAccount {
	public VWsignInAndCreateAccount() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//*[contains(text(),'SIGN IN')]")
	public WebElement signInButtonBeforeTypingEmailAndPassword;
	
	@FindBy(xpath = "//input[@name='userlogin']")
	public WebElement emailForSignIn;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement passwordForSignIn;
	
	@FindBy(xpath = "//input[@name='rememberMe']")
	public WebElement rememberMeButton;
	
	@FindBy(id = "submitLogin")
	public WebElement signInButtonAfterTypingEmailAndPassword;
	
	@FindBy(xpath = "//*[contains(text(),'Forgot password?')]")
	public WebElement forgotPassword;
	
	@FindBy(id = "email")
	public WebElement forgotPasswordEmail;
	
	@FindBy(xpath = "//input[@value=\"SUBMIT\"]")
	public WebElement submitButton;
	
	@FindBy (xpath = "//*[contains(text(),'Create An Account')]")
    public WebElement createAnAccount;
	
	@FindBy (xpath = "//input[@name='firstName']")
	public WebElement firstName;
	
	@FindBy (xpath = "//input[@name='lastName']")
	public WebElement lastName;
	
	@FindBy (xpath = "(//input[@name='email'])[1]")
	public WebElement emailToCreateNewAccount;
	
	@FindBy(id = "confirmEmail")
	public WebElement confirmEmail;
	
	@FindBy(id = "registerPassword")
	public WebElement createYourPassword;
	
	@FindBy(id = "confirmPassword")
	public WebElement confirmYourPassword;
	
	@FindBy(xpath = "//input[@name='agree']")
	public WebElement IagreeToReceiveNewsBox;
	
	@FindBy(xpath = "//input[@name='registerAgreePolicy']")
	public WebElement termsOfUseAndPrivacyPolicyBox;
	
	@FindBy(id = "submitRegister")
	public WebElement agreeAndCreateAnAccountButton;
	
	@FindBy (xpath = "(//input[@name='email'])[2]")
	public WebElement emailForSignUpForExclusiveOfferAndPromotions;
	
	@FindBy (xpath = "(//*[contains(text(),'GO')])[2]")
	public WebElement goButtonToSignUpForExclusiveOfferAndPromotions;
	
	@FindBy (xpath = "//*[contains(text(),'Sign Out')]")
	public WebElement signOut;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

