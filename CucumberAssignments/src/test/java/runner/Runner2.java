package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/java/stories/Test2.feature"},
		glue = "steps",
		tags = {"@SmokeTest,@RegressionTest"},
		dryRun = false,
		monochrome = true,
		snippets = SnippetType.CAMELCASE
		)
public class Runner2 extends AbstractTestNGCucumberTests {

}
