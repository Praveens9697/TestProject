package cucumberPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\user\\eclipse-workspace\\Praveen\\src\\cucumberPackage",
		glue = {"cucumberPackage"},
		tags = {"@tag1"},
		dryRun = false, monochrome = true
		)


public class TestRunner {

}
