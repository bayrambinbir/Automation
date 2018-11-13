package com.visionworks.step_definitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

	@Then("user sees the Page title saying {string}")
	public void user_sees_the_Page_title_saying(String expectedPageTitle) {
		String actualPageTitle = driver.getTitle();
		System.out.println("Page Title is: " + actualPageTitle);
		Assert.assertEquals(expectedPageTitle, actualPageTitle);

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

	@Then("user sees how many stores are there in that area")
	public void user_sees_how_many_stores_are_there_in_that_area() {
		String numbersOfStores = driver.findElement(By.xpath("(//span[@class='data-numberofstores'])[2]")).getText()
				.toString();
		System.out.println("There are " + numbersOfStores + " stores in your area");
	}

}
