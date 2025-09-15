package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
		features = "src/test/resources/features",
		glue = {"stepsDefs"},
		plugin = {
				"pretty",
				"html:target/cucumber-reports/cucumber.html",
				"json:target/cucumber-reports/cucumber.json",
				"junit:target/cucumber-reports/cucumber.xml"
		},
		monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

	@Test
	public void runCukes() {
		// This is just a placeholder for Gradle to detect a test
		// Actual execution is handled by AbstractTestNGCucumberTests
	}
}
