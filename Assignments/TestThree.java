package assignments.qatechhub;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class TestThree {
	WebDriver driver; 
 @Parameters({ "Browser" })
 @BeforeClass
 public void openBrowser(String browser) {
	 //generic code such that by changing the parameter browser can be changed
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
		  driver.get("https://flipkart.com");
		  
		  //handling lightbox
		  driver.findElement(By.xpath("//div[@id='container']/following-sibling::div/div/div/button")).click();		  
  }

  @Test(priority = 0)
  public void countURL() {
  	//Test to to find the count (number of) links on the homepage of Flipkart.
	  List<WebElement> links = driver.findElements(By.tagName("a"));
	  System.out.println("Number of links "+links.size());
  }
  
  @Test(priority = 1)
  public void printURL() {
  	//Test to print link text and URLs of all the links on the page of Flipkart.
	  List<WebElement> links = driver.findElements(By.tagName("a"));
	  
	  for(WebElement link : links){
			System.out.println("Link Text: "+ link.getText());
			System.out.println("URL: "+ link.getAttribute("href"));		
			System.out.println();
		}
  }
 
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
