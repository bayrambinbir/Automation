package com.visionworks.step_definitions;

import com.visionworks.pages.myAccount.VWshippingAddresses;

import cucumber.api.java.en.Then;

public class editShippingAddressStepDefs {
	
	VWshippingAddresses shippingAddresses = new VWshippingAddresses();
	
	@Then("user clicks on edit button to edit the address")
	public void user_clicks_on_edit_button_to_edit_the_address() {
	  shippingAddresses.editButton.click();
	}

}
