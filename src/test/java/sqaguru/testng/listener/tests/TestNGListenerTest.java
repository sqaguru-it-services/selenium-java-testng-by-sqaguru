package sqaguru.testng.listener.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGListenerTest {

	@Test
	public void failingTest() {
		System.out.println("testng test case execution");
		Assert.assertTrue(false, "test case execution failed: default");
	}
}
