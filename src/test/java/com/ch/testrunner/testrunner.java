package com.ch.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features= "Features",
		glue = "com.ch.stepdef",
		tags= "@tag"
		
		
		)



public class testrunner extends AbstractTestNGCucumberTests{

}
