package assignments.qatechhub;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.WebBrowser;

public class TestSix {
	WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		driver = WebBrowser.openBrowser("http://www.flipkart.com", "Chrome");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	}
	
	@Test(priority = 0)
	public void login() {
		//Test to log into flipkart
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("XXXXXXXXX");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("XXXXXXXXX");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='L0Z3Pu']")));
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
	}

	@Test(priority = 1)
	public void verifyLogin() throws IOException {
		//Test to verify if login is successful or not.
		WebElement account = driver.findElement(By.xpath("//*[@id=\"container\"]/descendant::div[15]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(account));
		if(account.isDisplayed())
		{
			System.out.println("Login Successful!");
		}
		else
		{
			System.out.println("Login Failed!");
		}
	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.close();
	}
}
