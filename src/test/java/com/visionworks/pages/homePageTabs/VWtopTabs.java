package com.visionworks.pages.homePageTabs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visionworks.utilities.Driver;

public class VWtopTabs {
	public VWtopTabs() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "(//*[contains(text(),'FIND A STORE')])[1]")
	public WebElement findAstoreTab;
	
	@FindBy(xpath = "(//*[contains(text(),'EYE EXAM')])[2]")
	public WebElement scheduleAnEyeExamTab;
	
	@FindBy (xpath = "//*[@id=\"dropdownInsurance\"]/a")
	public WebElement insuranceTab;
	
	@FindBy(id = "dtAccount")
	public WebElement myAccountTab;
	
	@FindBy(xpath = "/(//*[contains(text(),'Help')])[2]")
	public WebElement helpTab;
	
	@FindBy(xpath = "(//*[contains(text(),'Cart')])[1]")
	public WebElement cartTab;
	
	@FindBy(xpath = "(//*[contains(text(),'GLASSES')])[2]")
	public WebElement glassesTab;
	
	@FindBy(xpath = "(//*[contains(text(),'GLASSES')])[3]")
	public WebElement sunglassesTab;
	
	@FindBy(xpath = "//*[contains(text(),'CONTACT LENSES')]")
	public WebElement contactLensesTab;
	
	@FindBy(xpath = "//*[contains(text(),'BRANDS')]")
	public WebElement brandsTab;
	
	@FindBy(xpath = "(//*[contains(text(),'LENSES')])[2]")
	public WebElement lensesTab;

	@FindBy(xpath = "(//*[contains(text(),'OFFERS')])[1]")
	public WebElement offersTab;
	
	@FindBy(xpath = "(//input[@placeholder='SEARCH'])[2]")
	public WebElement searchTab;
	
	@FindBy(xpath = "(//*[contains(text(),'Learn More')])[2]")
	public WebElement learnMoreTab;
	
	@FindBy(xpath = "//*[contains(text(),'Click to schedule Eye Exam')]")
	public WebElement clickToScheduleEyeExam;
	
	
}

