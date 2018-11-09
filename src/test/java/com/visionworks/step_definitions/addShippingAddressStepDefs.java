package com.visionworks.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.visionworks.pages.myAccount.VWshippingAddresses;

import cucumber.api.java.en.Then;

public class addShippingAddressStepDefs {
	VWshippingAddresses shippingAddresses = new VWshippingAddresses();
	WebDriver driver;

	@Then("user clicks on Manage Addresses")
	public void user_clicks_on_Manage_Addresses() {
		shippingAddresses.manageAddresses.click();

	}

	@Then("user clicks on Add New Address button")
	public void user_clicks_on_Add_New_Address_button() {
		shippingAddresses.addNewAddressButton.click();

	}

	@Then("user fills all information as follows: Name {string} Last Name {string} PhoneFirstThree {string} PhoneSecondThree {string} PhoneLastFour {string} Address {string} City {string} Zip Code {string} State is TX")
	public void user_fills_all_information_as_follows_Name_Last_Name_PhoneFirstThree_PhoneSecondThree_PhoneLastFour_Address_City_Zip_Code_State_is_TX(
			String name, String lastName, String PhoneFirstThree, String PhoneSecondThree, String PhoneLastFour,
			String address, String city, String zipCode) {

		shippingAddresses.firstNameForShippingAddress.sendKeys(name);
		shippingAddresses.lastNameForShippingAddress.sendKeys(lastName);
		shippingAddresses.phoneFirstThreeDigitsForshippingAddresses.sendKeys(PhoneFirstThree);
		shippingAddresses.phoneSecondThreeDigitsForshippingAddresses.sendKeys(PhoneSecondThree);
		shippingAddresses.phoneLastFourDigitsForshippingAddresses.sendKeys(PhoneLastFour);
		shippingAddresses.addressForShippingAddress.sendKeys(address);
		shippingAddresses.cityForShippingAddress.sendKeys(city);
		shippingAddresses.zipCodeForShippingAddress.sendKeys(zipCode);
		shippingAddresses.stateForShippingAddress.click();
		shippingAddresses.texasForShippingAddress.click();

	}

	@Then("user clicks on Save button")
	public void user_clicks_on_Save_button() {
		shippingAddresses.saveAddressBookButtonForShippingAddress.click();
	}

	@Then("user verifies the confirmation saying that {string}")
	public void user_verifies_the_confirmation_saying_that(String expectedConfirmationForAddingAddress) {
		String actualConfirmationForAddingAddress = shippingAddresses.confirmationTextForShippingAddress.getText();
		Assert.assertEquals(expectedConfirmationForAddingAddress, actualConfirmationForAddingAddress);

	}
}
