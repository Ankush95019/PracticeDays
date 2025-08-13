package day20_Automation_Testing.testDemo1.src.test.java.testDemo1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Automation1 {
	WebDriver driver;
	
	@BeforeClass
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Test
	public void RegisterUser() {
		driver.get("https://demowebshop.tricentis.com/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/register']"))).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("FirstName")).sendKeys("Ankush");
		driver.findElement(By.id("LastName")).sendKeys("Dogra");
	}
	
	@Test
	public void launchGoogle() {
		driver.get("https://www.google.com/");
	}
	
//	@AfterClass
//	
//	public void tearDown() {
//		if(driver != null) {
//			driver.quit();
//		}
//	}
	
	

}
