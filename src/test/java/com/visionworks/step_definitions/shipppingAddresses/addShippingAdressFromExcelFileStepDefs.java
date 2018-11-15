package com.visionworks.step_definitions.shipppingAddresses;

import java.util.List;
import java.util.Map;

import com.visionworks.pages.myAccount.VWshippingAddresses;
import com.visionworks.utilities.ExcelUtil;

public class addShippingAdressFromExcelFileStepDefs {
	public static void main(String[] args) {
		
		VWshippingAddresses shippingAddresses = new VWshippingAddresses();
		
		String excelPath = "./src/test/resources/testdata/addressSheet.xlsx";
		
		ExcelUtil ex = new ExcelUtil(excelPath, "Sheet1");
		
		List<Map<String,String>> fileData = ex.getDataList();
		
		for (Map<String, String> map : fileData) {
			System.out.println(map.get("streetAddress"));
		}
		
		Map<String,String> tempMap = fileData.get(2);
		
		shippingAddresses.firstNameForShippingAddress.sendKeys("FirstName");
		
		
		System.out.println(fileData.get(0).get("streetAddress"));
		
		
	}
}
