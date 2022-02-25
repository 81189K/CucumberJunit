package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
				features = ".//Features/Login.feature",
				glue = "stepDefinitions",
				dryRun = false, //true --> to check
				monochrome = true,
				plugin = {"pretty"}//, "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}
		)

public class TestRunner {

}
