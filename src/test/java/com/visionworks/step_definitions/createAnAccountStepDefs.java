package com.visionworks.step_definitions;

import com.visionworks.pages.homePageTobTabs.VWtopTabs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class createAnAccountStepDefs {
	
	VWtopTabs topTabs = new VWtopTabs();
	
	@Given("user clicks on My Account main tab")
	public void user_clicks_on_My_Account_main_tab() {
		topTabs.myAccountTab.click();
		
	    
	}

	@Then("user clicks on Create An Account")
	public void user_clicks_on_Create_An_Account() {
	   
	}

	@Then("user fills out all the fields")
	public void user_fills_out_all_the_fields() {
	    
	}

	@Then("user clicks on I agree to receive news and offers from Visionworks box")
	public void user_clicks_on_I_agree_to_receive_news_and_offers_from_Visionworks_box() {
	    
	}

	@Then("user clicks on Check this box to show you understand the Terms of Use box")
	public void user_clicks_on_Check_this_box_to_show_you_understand_the_Terms_of_Use_box() {
	    
	}

	@Then("user clicks on Agree & Create An Account Box")
	public void user_clicks_on_Agree_Create_An_Account_Box() {
	    
	}

}
