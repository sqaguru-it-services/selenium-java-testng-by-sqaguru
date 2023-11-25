package karuna;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import org.testng.annotations.Test;

public class MultipOrigFaceTest {

	public static void main(String[] args) {
		String factor = "0.157742";
		double factorDouble = Double.parseDouble(factor);
		System.out.println("factorDouble: " + factorDouble);
		String origFaceValue = "186,000";
		// int origFaceValueInt = Integer.parseInt(origFaceValue);

		NumberFormat format = NumberFormat.getInstance(Locale.US);
		Number origFaceValueInt = 0;
		try {
			origFaceValueInt = format.parse(origFaceValue);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("origFaceValueInt: " + origFaceValueInt);

		double myDouble = 1.2;
		int myInt = 2;
		double result = myInt * myDouble;
		System.out.println("result: " + result);

		String myString2 = "10,112";
		int myInt2 = Integer.parseInt(myString2.replace(",", ""));
		System.out.println("myInt2: " + myInt2);
	}

	@Test
	public void roundUpTest() {
		double myNumber = 3.3216;
		long roundedUpNumber = Math.round(myNumber);
		System.out.println("roundedUpNumber: " + roundedUpNumber);
	}

}
