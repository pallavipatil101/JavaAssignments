package assignments.qatechhub;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class TestFour {
  WebDriver driver;
  
  @Parameters({ "Browser" })
  @BeforeClass
  public void openEbay(String browser) {
	  if(browser.equalsIgnoreCase("Chrome"))
	  {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
	  }
	  else if(browser.equalsIgnoreCase("Firefox")) {
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
	  }
	  else {
		  System.out.println("Wrong Choice");
	  }
	  driver.manage().window().maximize();
	  driver.get("https://www.ebay.com");

  }
  
  @Test(priority = 0)
  public void search() {
	  driver.findElement(By.id("gh-ac")).sendKeys("Apple watches");
	  WebElement drop = driver.findElement(By.id("gh-cat"));
	  Select select = new Select(drop);
	  select.selectByVisibleText("Cell Phones & Accessories");
	  driver.findElement(By.id("gh-btn")).click();
  }

  @Test(priority = 1)
  public void result() {
	  String result = driver.findElement(By.xpath("//h1[contains(text(),'results for ')]")).getText();
	  System.out.println("Results are: "+result);
	  System.out.println("---------------------------------------------------------");
  }
  
  @Test(priority = 2)
  public void nthProduct() {
	 String nthProduct = driver.findElement(By.xpath("//div[@id = 'srp-river-results']/ul/li[11]")).getText();
	 System.out.println("nth product is: "+nthProduct);
	 System.out.println("---------------------------------------------------------");
  }
  
  @Test(priority = 3)
  public void allProducts() {
	  List<WebElement> products = driver.findElements(By.xpath("//div[@id = 'srp-river-results']/ul/li/following-sibling::li"));
	  
	  for(WebElement pro : products) {
		  System.out.println(pro.getText());
		  System.out.println("---------------------------------------------------------");
	  }
  }
  
  @Test(priority = 4)
  public void scrollProducts() {
	  List<WebElement> products = driver.findElements(By.xpath("//div[@id = 'srp-river-results']/ul/li"));
	  Actions action = new Actions(driver);
	  Iterator<WebElement> it = products.iterator();
	  while(it.hasNext()) {
		  WebElement pro = it.next();
		  action.moveToElement(pro).build().perform();
		  
	  }	  
  }
  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}

