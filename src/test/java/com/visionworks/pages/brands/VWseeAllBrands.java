package com.visionworks.pages.brands;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visionworks.utilities.Driver;

public class VWseeAllBrands {
	public VWseeAllBrands() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy (xpath= "//a[@class='link-one'][contains(text(),'See All Brands')]")
	public WebElement seeAllBrands;
	
	@FindBy(xpath = "//a[@class='has-underline'] [contains(@href,'/glasses/alberto-romani')]")
	public WebElement albertoRomaniUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[@class='has-underline'] [contains(@href,'/glasses/anne-klein')]")
	public WebElement anneKleinUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[@class='has-underline'] [contains(@href,'/glasses/armani-exchange')]")
	public WebElement armaniExchangeUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[@class='has-underline'] [contains(@href,'/bcbg-max-azria')]")
	public WebElement bcbgMazAzriaUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[@class='has-underline'] [contains(@href,'/bebe')]")
	//a[@class='has-underline'] [contains(text(),'Bebe')]   we can use this xpath as well
	public WebElement bebeUnderSeeAllBrands;
	
	
	
	
	
	
}
