package TestNGDailyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGCrossBrowser {
	WebDriver driver;
	@Parameters({"Browser"})
	
	
	@Test
	public void beforeMethd(String bwsr) {
		if(bwsr.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();		
		}
		else if(bwsr.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(bwsr.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.get("https://www.facebook.com");
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("Naveen");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("Testing");

}

}
