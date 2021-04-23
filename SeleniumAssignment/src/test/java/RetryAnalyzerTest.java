import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class RetryAnalyzerTest implements IRetryAnalyzer {
	@Test
	public void f() {
	}

	public boolean retry(ITestResult result) {

		int retryCount = 0;
		if(retryCount != 3) 
		{
			retryCount++;
			System.out.println("Retrying: "+result.getName());
		}
		return false;
	}
}
