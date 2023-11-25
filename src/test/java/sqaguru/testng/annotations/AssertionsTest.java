package sqaguru.testng.annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsTest {
	@Test(groups="DEMO_TEST")
	public void softAssertTest() {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(true, "default pass");
		Reporter.log("default pass: ", true);
		softAssert.assertTrue(true, "default false");
		Reporter.log("default fail: ", true);
		softAssert.assertAll();

	}
}
