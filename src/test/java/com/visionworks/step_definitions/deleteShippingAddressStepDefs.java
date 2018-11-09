package com.visionworks.step_definitions;

import com.visionworks.pages.myAccount.VWshippingAddresses;

import cucumber.api.java.en.Then;

public class deleteShippingAddressStepDefs {
	
	VWshippingAddresses shippingAddresses = new VWshippingAddresses();
	
	@Then("user clicks on delete button to delete the address")
	public void user_clicks_on_delete_button_to_delete_the_address() {
		shippingAddresses.deleteButton.click();
	   
	}

	@Then("users sees a prompt saying are you sure to delete this address and click on the delete button")
	public void users_sees_a_prompt_saying_are_you_sure_to_delete_this_address_and_click_on_the_delete_button() {
	   shippingAddresses.deleteButtonUnderAreYouSureToDeleteThisAddress.click();
	   
	}

	
}
