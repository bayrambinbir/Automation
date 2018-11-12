package com.visionworks.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty",
				"html:target/default-cucumber-reports", //generates every time we run the cukes runner
				"json:target/cucumber.json",
				"junit:target/cucumber.xml"
		
		},
		
		tags= "@editShippingAddress",
//		features= {"src/test/resources/com/prestashop/features", 
//				"src/test/resources/com/ct_bnb/features"}, 
		features = "src/test/resources/com/visionworks/features", 
//		glue= {"com/prestashop/step_definitions", "com/ctbnb/step_definitions" }
		glue= "com/visionworks/step_definitions",
	dryRun = false,
				monochrome = true
		)
public class CukesRunner1  {
	
	}
