package com.visionworks.step_definitions.brands;

import com.visionworks.pages.brands.VWseeAllBrandsFrames;

import cucumber.api.java.en.Then;

public class frameBrandsStepDefs {
	VWseeAllBrandsFrames seeAllBrandsFrames = new VWseeAllBrandsFrames();
	@Then("user clicks on See All Brands")
	public void user_clicks_on_See_All_Brands(){
	    seeAllBrandsFrames.seeAllBrands.click();
	}
// 
	@Then("user should see all frame brands")
	public void user_should_see_all_frame_brands() {
	
	}

}
