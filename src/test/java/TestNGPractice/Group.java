package TestNGPractice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Group {
	@Test
public void tc1() {
	System.out.println(1);
	System.out.println(2);
	System.out.println(3);
}
	@Test
	private void tc2() {
		SoftAssert a =new SoftAssert();
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
	}
}
