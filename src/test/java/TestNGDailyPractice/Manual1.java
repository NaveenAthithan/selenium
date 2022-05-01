package TestNGDailyPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Manual1 {
	  @Test
		public void tc1() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		}
	     @Test(retryAnalyzer=Failure.class)
		public void tc2() {
			System.out.println(4);
			System.out.println(5);
			Assert.assertTrue(false);
			System.out.println(6);
		}
		
	     @Test
		public void tc3() {
			System.out.println(7);
			System.out.println(8);
		}
		
}
