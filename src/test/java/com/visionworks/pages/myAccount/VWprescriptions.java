package com.visionworks.pages.myAccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visionworks.utilities.Driver;

public class VWprescriptions {

	public VWprescriptions() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "(//*[contains(text(),'Prescriptions')])[3]")
	public WebElement prescriptions;
	

	@FindBy(xpath = "//*[contains(text(),'Manage Prescriptions')]")
	public WebElement managePrescriptions;
	
	@FindBy(xpath = "//*[contains(text(),'ADD NEW PRESCRIPTION')]")
	public WebElement addNewPrescription;
	
	@FindBy(xpath = "//input[@name='prescriptionName']")
	public WebElement prescriptionName;
	
	@FindBy(xpath = "//input[@name='firstName']")
	public WebElement patientName;
	
	@FindBy(xpath = "//input[@name='lastName']")
	public WebElement patientLastName;
	
	@FindBy(xpath = "//select[@name='patientMonth']")
	public WebElement monthForDateOfBirth;
	
	@FindBy(xpath = "//select[@name='patientYear']")
	public WebElement yearForDateOfBirth;
	
	@FindBy(xpath = "//input[@value='male']")
	public WebElement male;
	
	@FindBy(xpath = "//input[@value='female']")
	public WebElement female;
	
	@FindBy(xpath = "(//input[@name='glassesKind'])[1]")
	public WebElement glasses;
	
	@FindBy(xpath = "(//input[@name='glassesKind'])[2]")
	public WebElement contactLenses;
	
	@FindBy(xpath = "(//input[@name='prescriptionType'])[1]")
	public WebElement singleVersion;
	
	@FindBy(xpath = "(//input[@name='prescriptionType'])[2]")
	public WebElement progressiveNoLineBifocal;
	
	@FindBy(id = "inputState")
	public WebElement stateWherePrescriptionIssuedIn;
	
	@FindBy(xpath = "//select[@name='prescriptionMonth']")
	public WebElement prescriptionMonth;
	
	@FindBy(xpath = "//select[@name='prescriptionDay']")
	public WebElement prescriptionDay;

	@FindBy(xpath = "//select[@name='prescriptionYear']")
	public WebElement prescriptionYear;
	
	@FindBy(id = "odSph")
	public WebElement sphRightOd;
	
	@FindBy(id = "osSph")
	public WebElement sphLeftOs;
	
	@FindBy(id = "pdSingle")
	public WebElement PD;
	
	@FindBy(id = "odCyl")
	public WebElement cylRightOd;
	
	@FindBy(id = "osCyl")
	public WebElement cylLeftOs;
	
	@FindBy(id = "odAxis")
	public WebElement axisRightOd;
	
	@FindBy(id = "osAxis")
	public WebElement axisLeftOs;
	
	@FindBy(xpath = "//input[@name='isDualPD']")
	public WebElement Ihave2numbersForMyPdBox;
	
	@FindBy(id = "pdRight")
	public WebElement sphPdRight;
	
	@FindBy(id = "pdLeft")
	public WebElement cylPdLeft;
	
	@FindBy(xpath = "//*[contains(text(),'Clear All')]")
	public WebElement clearAll;

	@FindBy(xpath = "//*[contains(text(),'PROVIDE RX')]")
	public WebElement provideRx;
	
	@FindBy(xpath = "//input[@name='copyOfRX']")
	public WebElement upload;
	
	@FindBy(xpath = "//*[@id=\"accordionPstSend\"]/div[2]/div[1]/h5/a")
	public WebElement callTheDoctor;
	
	@FindBy(xpath = "//input[@name='doctorName']")
	public WebElement doctorName;
	
	@FindBy(xpath = "//input[@name='telArea']")
	public WebElement firstThreeDigitsForDoctor;
	
	@FindBy(xpath = "//input[@name='telPart1']")
	public WebElement secondThreeDigitsForDoctor;
	
	@FindBy(xpath = "//input[@name='telPart2']")
	public WebElement lastFourDigitsForDoctor;
	
	@FindBy(xpath = "//*[@id=\"accordionPstSend\"]/div[3]/div[1]/h5/a")
	public WebElement emailFax;

	@FindBy(xpath = "//*[contains(text(),'CONFIRM')]")
	public WebElement confirm;

	@FindBy(id = "savePrescriptionBtn")
	public WebElement saveButtonForPrescriptions;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
