package com.visionworks.step_definitions;

import org.openqa.selenium.WebDriver;

import com.visionworks.pages.homePageTobTabs.VWtopTabs;
import com.visionworks.pages.myAccount.VWsignInAndCreateAccount;
import com.visionworks.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class createAnAccountStepDefs {

	WebDriver driver = Driver.getDriver();
	String visonworksUrl = "https://www.visionworks.com/";
	VWtopTabs topTabs = new VWtopTabs();
	VWsignInAndCreateAccount signInAndCreateAccount = new VWsignInAndCreateAccount();

	@Given("user clicks on My Account main tab")
	public void user_clicks_on_My_Account_main_tab() {
		driver.get(visonworksUrl);
		topTabs.myAccountTab.click();

	}

	@Then("user clicks on Create An Account")
	public void user_clicks_on_Create_An_Account() {

		signInAndCreateAccount.createAnAccount.click();

	}

	@Then("user fills out all the fields")
	public void user_fills_out_all_the_fields() {
		signInAndCreateAccount.firstName.sendKeys("Jack");
		signInAndCreateAccount.lastName.sendKeys("Cruz");
		signInAndCreateAccount.emailToCreateNewAccount.sendKeys("bbinbir@visionworks.com");
		signInAndCreateAccount.confirmEmail.sendKeys("bbinbir@visionworks.com");
		signInAndCreateAccount.createYourPassword.sendKeys("Visionworks2018");
		signInAndCreateAccount.confirmYourPassword.sendKeys("Visionworks2018");

	}

	@Then("user clicks on I agree to receive news and offers from Visionworks box")
	public void user_clicks_on_I_agree_to_receive_news_and_offers_from_Visionworks_box() {
		signInAndCreateAccount.IagreeToReceiveNewsBox.click();

	}

	@Then("user clicks on Check this box to show you understand the Terms of Use box")
	public void user_clicks_on_Check_this_box_to_show_you_understand_the_Terms_of_Use_box() {
		signInAndCreateAccount.termsOfUseAndPrivacyPolicyBox.click();
	}

	@Then("user clicks on Agree & Create An Account Box")
	public void user_clicks_on_Agree_Create_An_Account_Box() {
		signInAndCreateAccount.agreeAndCreateAnAccountButton.click();

	}

}
