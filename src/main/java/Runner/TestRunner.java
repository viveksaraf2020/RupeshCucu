package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/java/Features/Hooks.feature"}
		,glue = {"stepDefinition"},
		format = {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		dryRun = false,
		monochrome = true,
		strict = true
//		tags = {"@End2End"}
		)


public class TestRunner 
{

}
