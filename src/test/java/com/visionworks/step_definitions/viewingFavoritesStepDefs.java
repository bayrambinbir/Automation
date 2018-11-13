package com.visionworks.step_definitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.visionworks.pages.myAccount.VWmyFavorites;
import com.visionworks.utilities.Driver;

import cucumber.api.java.en.Then;

public class viewingFavoritesStepDefs {
	WebDriver driver = Driver.getDriver();
	VWmyFavorites myFavorites = new VWmyFavorites();

	@Then("user clicks on My Favorites")
	public void user_clicks_on_My_Favorites() {
		myFavorites.favorites.click();
	}

	@Then("user should see how many favorites that he or she has")
	//@Then("user should see favorites")
	           //user should see how many favorites that he or she has
	public void user_should_see_how_many_favorites_that_he_or_she_has() {
		List<WebElement> favorites = driver.findElements(By.xpath("//div[@class='product jq-product']"));
		System.out.println("NUMBER OF FAVORITES: " + favorites.size()); // This line is counting the number for
																		// favorites


	}
	@Then("user sees the name, original price and reduced priced of the favorite item\\(s)")
	public void user_sees_the_name_original_price_and_reduced_priced_of_the_favorite_item_s() {
		List<WebElement> favorites = driver.findElements(By.xpath("//div[@class='product jq-product']"));
		List<WebElement> nameOfFavoriteItem = driver.findElements(By.xpath("//p[@class='p-name']"));
		List<WebElement> reducedPrice = driver.findElements(By.xpath("//div[@class='p-price clearfix']"));
		List<WebElement> originalPrice = driver.findElements(By.xpath("//s[@class = 'data-originalPrice']"));
		System.out.println("Information About Favorites: ");
		System.out.println("    NAME         ORIGINAL PRICE       REDUCED PRICE");
		for (int i = 0; i < favorites.size(); i++) {
			// System.out.println(favorites.get(i).getText());
			System.out.println(nameOfFavoriteItem.get(i).getText() + "         " +originalPrice.get(i).getText() + "         " + reducedPrice.get(i).getText());
		}
	}
}