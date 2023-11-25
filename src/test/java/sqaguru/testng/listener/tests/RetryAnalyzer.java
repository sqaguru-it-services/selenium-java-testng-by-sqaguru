package sqaguru.testng.listener.tests;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	int retryCounter = 0;
	int retryLimit = 3;

	public boolean retry(ITestResult result) {
		if (retryCounter < retryLimit) {
			retryCounter++;
			return true;
		} else {
			return false;
		}
	}

}
