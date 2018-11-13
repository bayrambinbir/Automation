package com.visionworks.step_definitions;

import org.openqa.selenium.WebDriver;

import com.visionworks.pages.offers.VWoffers;
import com.visionworks.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class offersWithoutSignInStepDefs {
	WebDriver driver = Driver.getDriver();
	VWoffers offers = new VWoffers();
	String visionWorksURL = "https://www.visionworks.com/";

	@Given("User clicks on offers top tab")
	public void user_clicks_on_offers_top_tab() {
		driver.get(visionWorksURL);
		offers.offersTab.click();
	   
	}

	@Then("User enters zip code")
	public void user_enters_zip_code() {
		offers.enterZipCodeUnderOffers.sendKeys("78205");
	    
	}

	@Then("User clicks on Go button for zip code")
	public void user_clicks_on_Go_button_for_zip_code() {
		offers.goButtonUnderOffers.click();
	   
	}

	@Then("User sees the map with store locations")
	public void user_sees_the_map_with_store_locations() {
	
	}


}
