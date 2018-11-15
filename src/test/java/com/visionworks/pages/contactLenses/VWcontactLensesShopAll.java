package com.visionworks.pages.contactLenses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visionworks.utilities.Driver;

public class VWcontactLensesShopAll {
	public VWcontactLensesShopAll() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//a[@class='panel-title'][contains(text(),'PRODUCT TYPE')]")
	public WebElement productTypeDropDownButton;
	
	@FindBy(xpath = "//a[contains(@class,'checked')]")
	public WebElement contactLensCheckBox;
	
	@FindBy(xpath = "(//a[@class='checkbox-link '][1])[1]")
	public WebElement frameCheckBox;
	
	@FindBy(xpath = "(//*[contains(text(),'Clear')])[1]")
	public WebElement clearForProductTypeButton;
	
	@FindBy(xpath = "(//*[contains(text(),'BRAND')])[3]")
	public WebElement brandDropDownButton;
	
	@FindBy(id = "searchinput")
	public WebElement typeYourBrandHereBox;
	
	@FindBy(xpath = "//span[contains(text(),'Acuvue')]")
	public WebElement acuvueCheckBoxUnderBrand;
	
	@FindBy(xpath = "//span[contains(text(),'Air Optix')]")
	public WebElement airOptixCheckBoxUnderBrand;
	
	@FindBy(xpath = "//span[contains(text(),'Aquatech')]")
	public WebElement aquaTechCheckBoxUnderBrand;
	
	@FindBy(xpath = "//span[contains(text(),'Avaira')]")
	public WebElement avairaCheckBoxUnderBrand;
	
	@FindBy(xpath = "//span[contains(text(),'Biofinity')]")
	public WebElement biofinityCheckBoxUnderBrand;
	
	@FindBy(xpath = "//span[contains(text(),'Biomedics')]")
	public WebElement biomedicsCheckBoxUnderBrand;
	
	@FindBy(xpath = "//span[contains(text(),'Biotrue')]")
	public WebElement biotrueCheckBoxUnderBrand;
	
	@FindBy(xpath = "//span[contains(text(),'Clariti')]")
	public WebElement claritiCheckBoxUnderBrand;
	
	@FindBy(xpath = "//span[contains(text(),'ClearSight')]")
	public WebElement clearSightCheckBoxUnderBrand;
	
	@FindBy(xpath = "//span[contains(text(),'Dailies')]")
	public WebElement dailiesCheckBoxUnderBrand;
	
	@FindBy(xpath = "//span[contains(text(),'Expressions')]")
	public WebElement expressionsCheckBoxUnderBrand;
	
	@FindBy(xpath = "//span[contains(text(),'Focus')]")
	public WebElement focusCheckBoxUnderBrand;
	
	@FindBy(xpath = "//span[contains(text(),'Frequency')]")
	public WebElement frequencyCheckBoxUnderBrand;
	
	@FindBy(xpath = "//span[contains(text(),'FreshLook')]")
	public WebElement freshLookCheckBoxUnderBrand;
	
	@FindBy(xpath = "//span[contains(text(),'Hydrasoft')]")
	public WebElement hydrasoftCheckBoxUnderBrand;
	
	@FindBy(xpath = "//span[contains(text(),'Myday')]")
	public WebElement mydayCheckBoxUnderBrand;
	
	@FindBy(xpath = "//span[contains(text(),'Optima')]")
	public WebElement optimaCheckBoxUnderBrand;
	
	@FindBy(xpath = "//span[contains(text(),'Preference')]")
	public WebElement preferenceCheckBoxUnderBrand;
	
	@FindBy(xpath = "//span[contains(text(),'Proclear')]")
	public WebElement procleareCheckBoxUnderBrand;
	
	@FindBy(xpath = "//span[contains(text(),'PureVision')]")
	public WebElement pureVisionCheckBoxUnderBrand;
	
	@FindBy(xpath = "//span[contains(text(),'Silsoft')]")
	public WebElement silsoftCheckBoxUnderBrand;
	
	@FindBy(xpath = "//span[contains(text(),'Soflens')]")
	public WebElement soflensCheckBoxUnderBrand;
	
	@FindBy(xpath = "//span[contains(text(),'Ultra')]")
	public WebElement ultraCheckBoxUnderBrand;
	
	@FindBy(xpath = "//span[contains(text(),'Vertex')]")
	public WebElement vertexCheckBoxUnderBrand;
	
	@FindBy(xpath = "(//a[@class='clear'][contains(text(),'Clear')])[2]")
	public WebElement clearButtonUnderBrand;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
