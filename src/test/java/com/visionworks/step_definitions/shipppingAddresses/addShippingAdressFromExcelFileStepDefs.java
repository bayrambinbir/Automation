package com.visionworks.step_definitions.shipppingAddresses;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.visionworks.pages.myAccount.VWshippingAddresses;
import com.visionworks.utilities.Driver;
import com.visionworks.utilities.ExcelUtil;

import cucumber.api.java.en.Then;
import groovy.transform.Field;

public class addShippingAdressFromExcelFileStepDefs {
	VWshippingAddresses shippingAddresses = new VWshippingAddresses();
	WebDriver driver = Driver.getDriver();

	public static void main(String[] args) {

	}

	@Then("user fills all information from Excel file")
	public void user_fills_all_information_from_Excel_file() {
		String excelPath = "./src/test/resources/testdata/AddAddress.xlsx";

		ExcelUtil ex = new ExcelUtil(excelPath, "AddShippingAddress");

		List<Map<String, String>> fileData = ex.getDataList();

//		for (Map<String, String> map : fileData) {
//			System.out.println("Last Name is: "+map.get("LastName"));
//		}
//
//		 Map<String,String> tempMap = fileData.get(2);
//
//		 shippingAddresses.firstNameForShippingAddress.sendKeys("FirstName");

		System.out.println("Phone First Three is: " + fileData.get(0).get("PhoneFirstThree"));

		System.out.println("Address is: " + fileData.get(0).get("Address"));
		shippingAddresses.firstNameForShippingAddress.sendKeys(fileData.get(0).get("FirstName"));
		shippingAddresses.lastNameForShippingAddress.sendKeys(fileData.get(0).get("LastName"));
		shippingAddresses.phoneFirstThreeDigitsForshippingAddresses.sendKeys(fileData.get(0).get("PhoneFirstThree"));
		shippingAddresses.phoneSecondThreeDigitsForshippingAddresses.sendKeys(fileData.get(0).get("PhoneSecondThree"));
		shippingAddresses.phoneLastFourDigitsForshippingAddresses.sendKeys(fileData.get(0).get("PhoneLastFour"));
		shippingAddresses.addressForShippingAddress.sendKeys(fileData.get(0).get("Address"));
		shippingAddresses.cityForShippingAddress.sendKeys(fileData.get(0).get("City"));
		shippingAddresses.stateForShippingAddress.click();
		shippingAddresses.texasForShippingAddress.click();

		System.out.println("Zip Code is:" + fileData.get(0).get("ZipCode")); // Output is 78205.0
		//shippingAddresses.zipCodeForShippingAddress.sendKeys(fileData.get(0).get("ZipCode"));
		shippingAddresses.zipCodeForShippingAddress.sendKeys("78205");

	}

}
