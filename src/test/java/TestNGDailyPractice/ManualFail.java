package TestNGDailyPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManualFail {
     @Test
	public void tc1() {
	System.out.println(1);
	System.out.println(2);
	System.out.println(3);
	
	}
     @Test
	public void tc2() {
		System.out.println(4);
		System.out.println(5);
		Assert.assertTrue(true);
		System.out.println(6);
	}
	
     @Test
	public void tc3() {
		System.out.println(7);
		System.out.println(8);
	}
	
	
}
