package sqaguru.testng.annotations;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersTest {
	@Parameters("param")
	@BeforeMethod
	public void beforeMethod(String param) {
		System.out.println("before methods " + param);
	}

	@Parameters("param")
	@Test
	public void parameterTest(String param) {
		System.out.println("parameter" + param);
	}
}
