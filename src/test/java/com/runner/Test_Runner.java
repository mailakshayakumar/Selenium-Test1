package com.runner;

import org.junit.runner.RunWith;

import cucumber.runtime.Glue;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\Feature_Files\\shopping.feature"},dryRun = false,glue = "com.steps",plugin = {"html:target"}
)

public class Test_Runner {
	

	
}
