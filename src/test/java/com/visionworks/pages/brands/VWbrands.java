package com.visionworks.pages.brands;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visionworks.utilities.Driver;

public class VWbrands {
	public VWbrands() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//*[contains(text(),'BRANDS')]")
	public WebElement brandsTab;

	@FindBy(xpath = "//a[@class='thumbnail'] [contains(@href,'/glasses/ray-ban')]")
	public WebElement rayBanTopTab;
	
	@FindBy(xpath = "//a[@class='thumbnail'] [contains(@href,'/glasses/michael-kors')]")
	public WebElement michealKorsTopTab;
	
	@FindBy(xpath = "//a[@class='thumbnail'] [contains(@href,'/coach')]")
	public WebElement coachTopTab;
	
	@FindBy(xpath = "//a[@class='thumbnail'] [contains(@href,'/nike')]")
	public WebElement nikeTopTab;
	
	@FindBy(xpath = "//a[@class='thumbnail'] [contains(@href,'/armani-exchange')]")
	public WebElement armaniExchangeTopTab;
	
	@FindBy(xpath = "//a[@class='thumbnail'] [contains(@href,'/lamb')]")
	public WebElement lambTopTab;
	
	@FindBy(xpath = "//a[@class='thumbnail'] [contains(@href,'/lacoste')]")
	public WebElement lacosteTopTab;
	
	@FindBy(xpath = "//a[@class='thumbnail'] [contains(@href,'/guess')]")
	public WebElement guessTopTab;
	
	@FindBy(xpath = "//a[@class='thumbnail'] [contains(@href,'/bebe')]")
	public WebElement bebeTopTab;
	
	@FindBy(xpath = "//a[@class='thumbnail'] [contains(@href,'/penguin')]")
	public WebElement penguinTopTab;
	
	@FindBy(xpath = "//a[@class='thumbnail'] [contains(@href,'/chelsea-morgan')]")
	public WebElement chelseMorganTopTab;
	
	@FindBy(xpath = "//a[@class='thumbnail'] [contains(@href,'/robert-mitchel')]")
	public WebElement robertMitchelTopTab;
	
	@FindBy(xpath = "//a[@class='thumbnail'] [contains(@href,'/gant')]")
	public WebElement gantTopTab;
	
	@FindBy(xpath = "//a[@class='thumbnail'] [contains(@href,'/zac-posen')]")
	public WebElement zacPosenTopTab;
	
	@FindBy(xpath = "//a[@class='thumbnail'] [contains(@href,'/vera-bradley')]")
	public WebElement veraBradleyTopTab;
	
	@FindBy(xpath = "//a[@class='thumbnail'] [contains(@href,'/cole-haan')]")
	public WebElement coleHaanTopTab;
	
	
	
	
	
	
	
	

}
