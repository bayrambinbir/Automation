package com.visionworks.pages.lenses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visionworks.utilities.Driver;

public class VWlenses {
	public VWlenses() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "(//*[contains(text(),'LENSES')])[2]")
	public WebElement lensesTab;
	
	@FindBy(xpath = "//a[contains(text(),'A Guide to Lenses')]")
	public WebElement aGuideToLenses;
	
	@FindBy(xpath = "//strong[contains(text(),'LAUNCH LENS FINDER')]")
	public WebElement lunchLensFinder;
	
	@FindBy(xpath = "//a[contains(text(),'Non-Glare')]")
	public WebElement nonGlare;
	
	@FindBy(xpath = "//a[contains(text(),'High Definition')]")
	public WebElement highDefinition;
	
	@FindBy(xpath = "//a[@href='#Polarized']")
	public WebElement polarized;
	
	@FindBy(xpath = "//a[contains(text(),'Adaptive')]")
	public WebElement adaptive;
	
	@FindBy(xpath = "//a[contains(text(),'Thindex')]")
	public WebElement thindex;
	
	
	
	
	
	
	
	
	
	
	
	

}
