package assignments.qatechhub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestOne {
	WebDriver driver;
	
  
  
  @BeforeClass
  public void openBrowser() {
	    System.setProperty("webdriver.chrome.driver\"", "/home/josh/eclipse-workspace/SeleniumDemo/Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://qatechhub.com");
		driver.manage().window().maximize();
  }  
  
  @Test
  public void testOne() {
  	//Test to print PASS if the title of the page matches with “QA Automation Tools Trainings and Tutorials | QA Tech Hub” else FAIL.
	  	  String acttitle = driver.getTitle();
	  //Assert.assertEquals(acttitle, "QA Automation Tools Trainings and Tutorials | QA Tech Hub");	  
	  if(acttitle.equalsIgnoreCase("QA Automation Tools Trainings and Tutorials | QA Tech Hub")){
		  System.out.println("PASS");
	  }
	  else {
		  System.out.println("FAIL");
	  }
  }
  
  @AfterTest
  public void afterTest() {
  	//Navigate to the Facebook page (https://www.facebook.com). Navigate back to the QA Tech Hub. Print current URL.
	  driver.navigate().to("https://www.facebook.com");
	  System.out.println("Navigated to facebook");
	  driver.navigate().back();
	  System.out.println("Navigated back to QAtechhub");
	  System.out.println("URL is: "+driver.getCurrentUrl());
	  driver.navigate().forward();
	  System.out.println("Navigated forward to facebook again");
	  driver.navigate().refresh();
  }
  
  @AfterSuite
  public void close() {
	  driver.close();
  }

}
