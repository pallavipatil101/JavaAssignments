package assignments.qatechhub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.WebBrowser;

public class TestEight {
	WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		driver = WebBrowser.openBrowser("https://www.gmail.com", "chrome");
	}
	
	@Test
	public void gmailLogin() throws InterruptedException {
		driver.findElement(By.id("identifierId")).sendKeys("pallupatil485@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();
		//driver.findElement(By.name("Passwd")).sendKeys("");
		//driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
