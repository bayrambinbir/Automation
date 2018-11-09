package com.visionworks.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty",
				"html:target/default-cucumber-reports",
				"json:target/cucumber.json"
		 
		},
		
//		tags="@smoke",
//		features="src/test/resources/com/prestashop/features", 
//		glue="com/prestashop/step_definitions"
		
		tags="@accountSettings",
		features="src/test/resources/com/visionworks/features", 
		glue="com/visionworks/step_definitions"
		
//		,dryRun = true
		,monochrome = true
		)
public class SmokeTestRunner1 {}
