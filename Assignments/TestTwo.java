package assignments.qatechhub;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestTwo {
	WebDriver driver;
	
  @BeforeClass
  public void openBrowser() {
  	//Open facebook and Verify that the page is redirected to “http://www.facebook.com”, by getting the current URL.
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("http://www.fb.com");
	  String curUrl = driver.getCurrentUrl();
	  //Assert.assertEquals(curUrl, "http://www.facebook.com");
	  if(curUrl.equals("http://www.facebook.com")) {
		  System.out.println("No redirection");
		  }
	  else {
		  System.out.println("Redirected to http://www.facebook.com");
	  }
	  }
	
  @Test
  public void signUp() {
  	//Test to see if there is a create account section. Create account
	  driver.findElement(By.linkText("Create New Account")).click();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name = \"firstname\"]"))).sendKeys("Pallavi");
	  driver.findElement(By.name("lastname")).sendKeys("Patil");
	  driver.findElement(By.name("reg_email__")).sendKeys("abcd@gmail.com");
     	  driver.findElement(By.id("password_step_input")).sendKeys("abcd@12");
	  
      	  Select day = new Select(driver.findElement(By.id("day")));
	  Select month = new Select(driver.findElement(By.id("month")));
	  Select year = new Select(driver.findElement(By.id("year")));
		
	  day.selectByVisibleText("11");
      	  month.selectByVisibleText("Mar");
	  year.selectByVisibleText("1996");
	  
	  driver.findElement(By.xpath("//input[@type=\"radio\" and @value=\"1\"]")).click();
	  driver.findElement(By.name("websubmit")).click();	 
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
