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
	
	@FindBy(xpath = "//a[contains(text(),'Blue Moon')]")
	public WebElement blueMoonUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Calvin Klein')]")
	public WebElement calvinKleinUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Candies')]")
	public WebElement candiesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Caterpillar')]")
	public WebElement caterpillarUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Catherine Deneuve')]")
	public WebElement catherineDeneuveUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Chelsea Morgan')]")
	public WebElement chelseaMorganUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Coach')]")
	public WebElement coachUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Splendor')]")
	public WebElement splendorUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Stetson')]")
	public WebElement stetsonUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Swarovski')]")
	public WebElement stwarovskiUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[@class='has-underline'] [contains(text(),'Technolite')]")
	public WebElement technoliteUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Technolite Flex')]")
	public WebElement technoliteFlexUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Tony Hawk')]")
	public WebElement tonyHawkUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Transformers')]")
	public WebElement transformersUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Under $100')]")
	public WebElement under$100UnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Value Frames')]")
	public WebElement valueFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Vera Bradley')]")
	public WebElement veraBradleyUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Zac Posen')]")
	public WebElement zacPosenUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Cole Haan')]")
	public WebElement coleHaanUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Columbia')]")
	public WebElement columbiaUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Converse')]")
	public WebElement converseUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Diesel')]")
	public WebElement dieselUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Dragon')]")
	public WebElement dragonUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'DVF')]")
	public WebElement dvfUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Flexon')]")
	public WebElement flexonUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Gant')]")
	public WebElement gantUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[@class='has-underline'] [contains(text(),'Guess')]")
	public WebElement guessUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Guess by Marciano')]")
	public WebElement guessByMarcianoUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Harley Davidson')]")
	public WebElement harleyDavidsonUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Indi')]")
	public WebElement indiUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Jones NY')]")
	public WebElement jonesNyUnderSeeAllBrands;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
