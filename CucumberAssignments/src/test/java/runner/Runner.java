package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/java/stories/Test.feature"},
		glue = "steps",
		dryRun = false,
		monochrome = true,
		snippets = SnippetType.CAMELCASE
		)
public class Runner extends AbstractTestNGCucumberTests {

}
