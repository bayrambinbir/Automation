package com.visionworks.step_definitions.accountSettings;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.visionworks.pages.homePageTopTabs.VWtopTabs;
import com.visionworks.pages.myAccount.VWaccountSettings;
import com.visionworks.pages.myAccount.VWmyAccountSubTabs;
import com.visionworks.pages.myAccount.VWsignInAndCreateAccount;
import com.visionworks.utilities.BrowserUtils;
import com.visionworks.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class accountSettingsStepDefs {

	WebDriver driver = Driver.getDriver();
	String visionworksUrl = "https://www.visionworks.com/";

	VWtopTabs topTabs = new VWtopTabs();
	VWmyAccountSubTabs myAccountSubTabs = new VWmyAccountSubTabs();
	VWaccountSettings accountSettings = new VWaccountSettings();
	VWsignInAndCreateAccount signInAndCreateAccount = new VWsignInAndCreateAccount();

	@Given("user signs in to the account")
	public void user_signs_in_to_the_account() throws Throwable {

		driver.get(visionworksUrl);
		BrowserUtils.waitForPageToLoad(5);
		BrowserUtils.waitForVisibility(topTabs.myAccountTab, 5);
		topTabs.myAccountTab.click();
		signInAndCreateAccount.signInButtonBeforeTypingEmailAndPassword.click();
		signInAndCreateAccount.emailForSignIn.sendKeys("bayram1923@gmail.com");
		signInAndCreateAccount.passwordForSignIn.sendKeys("Bayram2019");
		signInAndCreateAccount.signInButtonAfterTypingEmailAndPassword.click();
	}

	@Then("user clicks on My Account")
	public void user_clicks_on_My_Account() {
		topTabs.myAccountTab.click();
		BrowserUtils.waitForPageToLoad(5);

		myAccountSubTabs.myAccountSubTab.click();

	}

	@Then("user clicks on Account Settings OR Manage Account Settings")
	public void user_clicks_on_Account_Settings_OR_Manage_Account_Settings() {
		accountSettings.manageAccountSettings.click();
	}

	@Then("user clikcs on the change password buttom to change password")
	public void user_clikcs_on_the_change_password_buttom_to_change_password() {
		accountSettings.changePasswordBox.click();

	}

	@Then("user enters the current password")
	public void user_enters_the_current_password() {
		accountSettings.currentPassword.sendKeys("Bayram2018");

	}

	@Then("user enters the new password")
	public void user_enters_the_new_password() {
		accountSettings.createNewPassword.sendKeys("Bayram2019");

	}

	@Then("user confirms the new password")
	public void user_confirms_the_new_password() {
		accountSettings.confirmNewPassword.sendKeys("Bayram2019");
	}

	@Then("user clicks on saves button")
	public void user_clicks_on_saves_button() {
		accountSettings.saveButtonInAccountSettings.click();

	}

	@Then("user sees the confirmation saying that {string}")
	public void user_sees_the_confirmation_saying_that(String expectedText) {
		String actualConfirmationText = accountSettings.confirmationForPasswordChange.getText();
		Assert.assertEquals(expectedText, actualConfirmationText);

	}

}
