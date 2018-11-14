package com.visionworks.pages.brands;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visionworks.utilities.Driver;

public class VWsortDropdownMenu {
	public VWsortDropdownMenu() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(xpath = "//span[contains(text(), 'Relevance')]")
	public WebElement relevance;
	
	@FindBy(xpath = "//span[contains(text(), 'Brand Name')]")
	public WebElement brandName;
	
	@FindBy(xpath = "//span[contains(text(), 'Lowest Price')]")
	public WebElement lowestPrice;
	
	@FindBy(xpath = "//span[contains(text(), 'Highest Price')]")
	public WebElement highestPrice;
	
	@FindBy(xpath = "//span[contains(text(), 'Best Seller')]")
	public WebElement bestSeller;
	
	@FindBy(xpath = "//span[contains(text(), 'Newest')]")
	public WebElement newest;
	

}
