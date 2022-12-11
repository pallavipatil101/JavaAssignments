package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebBrowser {
	static WebDriver driver;
	public static WebDriver openBrowser(String url, String browser) {

		if(browser.equalsIgnoreCase("chrome")) {	
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			return driver;
		}
		
		else if(browser.equalsIgnoreCase("Firefox")) {
			  WebDriverManager.firefoxdriver();
			  driver = new FirefoxDriver();
			  driver.get(url);
			  driver.manage().window().maximize();
			  return driver;
		}
		
		else {
			System.out.println("You entered wrong browser name");
		}
		return driver;
	}
}

