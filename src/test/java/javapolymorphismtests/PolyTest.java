package javapolymorphismtests;

public class PolyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI rbi = new SBI();
		rbi.printHello();
		rbi = new HDFC();
		rbi.printHello();
		
	}

}
