package com.visionworks.pages.brands;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visionworks.utilities.Driver;

public class VWseeAllBrandsFrames {
	public VWseeAllBrandsFrames() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy (xpath= "//a[@class='link-one'][contains(text(),'See All Brands')]")
	public WebElement seeAllBrands;
	
	@FindBy(xpath = "//a[@class='has-underline'] [contains(@href,'/glasses/alberto-romani')]")
	public WebElement albertoRomaniForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[@class='has-underline'] [contains(@href,'/glasses/anne-klein')]")
	public WebElement anneKleinForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[@class='has-underline'] [contains(@href,'/glasses/armani-exchange')]")
	public WebElement armaniExchangeForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[@class='has-underline'] [contains(@href,'/bcbg-max-azria')]")
	public WebElement bcbgMazAzriaForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[@class='has-underline'] [contains(@href,'/bebe')]")
	//a[@class='has-underline'] [contains(text(),'Bebe')]   we can use this xpath as well
	public WebElement bebeForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Blue Moon')]")
	public WebElement blueMoonForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Calvin Klein')]")
	public WebElement calvinKleinForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Candies')]")
	public WebElement candiesForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Caterpillar')]")
	public WebElement caterpillarForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Catherine Deneuve')]")
	public WebElement catherineDeneuveForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Chelsea Morgan')]")
	public WebElement chelseaMorganForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Coach')]")
	public WebElement coachUnderForFramesSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Splendor')]")
	public WebElement splendorForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Stetson')]")
	public WebElement stetsonForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Swarovski')]")
	public WebElement stwarovskiForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[@class='has-underline'] [contains(text(),'Technolite')]")
	public WebElement technoliteForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Technolite Flex')]")
	public WebElement technoliteFlexForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Tony Hawk')]")
	public WebElement tonyHawkForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Transformers')]")
	public WebElement transformersForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Under $100')]")
	public WebElement under$100ForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Value Frames')]")
	public WebElement valueFramesForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Vera Bradley')]")
	public WebElement veraBradleyForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Zac Posen')]")
	public WebElement zacPosenForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Cole Haan')]")
	public WebElement coleHaanForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Columbia')]")
	public WebElement columbiaForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Converse')]")
	public WebElement converseForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Diesel')]")
	public WebElement dieselForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Dragon')]")
	public WebElement dragonForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'DVF')]")
	public WebElement dvfForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Flexon')]")
	public WebElement flexonForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Gant')]")
	public WebElement gantForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[@class='has-underline'] [contains(text(),'Guess')]")
	public WebElement guessForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Guess by Marciano')]")
	public WebElement guessByMarcianoForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Harley Davidson')]")
	public WebElement harleyDavidsonForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Indi')]")
	public WebElement indiForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Jones NY')]")
	public WebElement jonesNyForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Joseph Abboud')]")
	public WebElement josephAbboudForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Kate Spade')]")
	public WebElement kateSpadeForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Kenneth Cole')]")
	public WebElement kennethColeForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Kensie')]")
	public WebElement kensieForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'L.A.M.B')]")
	public WebElement lambUnderForFramesSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Lacoste')]")
	public WebElement lacosteForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Leon Max')]")
	public WebElement leonMaxForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Longchamp')]")
	public WebElement longChampForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Max Studio')]")
	public WebElement maxStudioForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Michael Kors')]")
	public WebElement michaelKorsForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Nike')]")
	public WebElement nikeForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Nine West')]")
	public WebElement nineWestForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Neill')]")
	public WebElement oNeillForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'OTIS+GREY')]")
	public WebElement otisGreyForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'PAW Patrol')]")
	public WebElement pawPatrolForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Penguin')]")
	public WebElement penguinPatrolForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Perry Ellis')]")
	public WebElement perryEllisForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Rampage')]")
	public WebElement rampageForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Randy Jackson')]")
	public WebElement randyJacksonForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Ray-Ban')]")
	public WebElement rayBanForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Raycers')]")
	public WebElement raycersForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Realtree')]")
	public WebElement realTreeForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Robert Mitchel')]")
	public WebElement robertMitchelForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Salsa')]")
	public WebElement salsaForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'Skechers')]")
	public WebElement skecherForFramesUnderSeeAllBrands;
	
	@FindBy(xpath = "//a[contains(text(),'South Hampton')]")
	public WebElement southHamptonForFramesUnderSeeAllBrands;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
