package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//Features", 
glue = "com.stepdef", 
dryRun = false,
plugin = {"pretty"}
//monochrome = true
)


public class Runner_class {

}
