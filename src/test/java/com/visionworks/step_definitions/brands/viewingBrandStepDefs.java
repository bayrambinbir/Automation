package com.visionworks.step_definitions.brands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.visionworks.pages.brands.VWTopTabBrands;
import com.visionworks.pages.brands.VWsortDropdownMenu;
import com.visionworks.utilities.Driver;

import cucumber.api.java.en.Then;

public class viewingBrandStepDefs {
	VWTopTabBrands topTabBrands = new VWTopTabBrands(); 
	VWsortDropdownMenu sortDropdownMenu = new VWsortDropdownMenu();
	WebDriver driver = Driver.getDriver();
	@Then("user clicks on Brands top tab")
	public void user_clicks_on_Brands_top_tab() {
	    topTabBrands.brandsTab.click();
	}

	@Then("user selects a brand")
	public void user_selects_a_brand() {
	    topTabBrands.coachTopTab.click();
	}

	@Then("user should see all glasses available for chosen brand")
	public void user_should_see_all_glasses_available_for_chosen_brand() {
	    
	}
	
	@Then("user chooses newest glasses from the drop down filter")
	public void user_chooses_newest_glasses_from_the_drop_down_filter() {
	   sortDropdownMenu.relevance.click();
	   sortDropdownMenu.newest.click();
	}

	@Then("user sees the price and name of first three glasses- from left to right")
	public void user_sees_the_price_and_name_of_first_three_glasses_from_left_to_right() {
		List<WebElement> names = driver.findElements(By.xpath("//span[@class = 'text-book data-name']"));
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class = 'p-price data-price']"));
		System.out.println("Names         Prices");
		for (int i = 0; i < 3; i++) {
		System.out.println(names.get(i).getText() + "----->" +prices.get(i).getText());	
		}
	}


}
