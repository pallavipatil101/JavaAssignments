package assignments.qatechhub;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.WebBrowser;

public class TestFive {

	public static void main(String[] args) throws IOException {
		WebDriver driver = WebBrowser.openBrowser("http://www.snapdeal.com", "Chrome");
		WebElement login = driver.findElement(By.xpath("//div[@class='accountInner']/span[1]"));

		Actions a = new Actions(driver);
		a.moveToElement(login).perform();
		driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']/a")).click();
		WebElement loginFrame = driver.findElement(By.id("loginIframe"));
		driver.switchTo().frame(loginFrame);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("userName")));

		driver.findElement(By.id("userName")).sendKeys("pallupatil485@gmail.com");
		driver.findElement(By.id("checkUser")).click();
	}
}
