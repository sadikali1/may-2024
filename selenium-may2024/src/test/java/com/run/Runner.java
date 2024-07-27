package com.run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature", 
		glue = "com.steps", 
		plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json", "junit:target/cucumber.xml"},
		tags = "@Add")
public class Runner {

}
