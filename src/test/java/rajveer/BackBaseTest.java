package rajveer;

import org.testng.annotations.Test;

public class BackBaseTest {
	@Test
	public void test1() {
		System.out.println("hello");
		String string = "1,000.00";
		// String fieldValue = String.format("%.2f", Double.parseDouble(string));
		Double string2 = Double.parseDouble(string.replace(",", ""));
		String fieldValue = String.format("%.2f", string2);
		System.out.println(fieldValue);
	}
}
