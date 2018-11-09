package com.visionworks.pages.scheduleAnEyeExam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visionworks.utilities.Driver;

public class VWscheduleAnEyeExam {
	public VWscheduleAnEyeExam() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(xpath = "//*[contains(text(),'SCHEDULE AN EYE EXAM')]")
	public WebElement scheduleAnEyeExamTab;
	
	@FindBy(xpath = "(//input[@name='address'])[3]")
	public WebElement enterAlocation;
	
}
