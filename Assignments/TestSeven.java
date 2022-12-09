package assignments.qatechhub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utility.WebBrowser;

public class TestSeven {
	WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		driver = WebBrowser.openBrowser("https://jqueryui.com/droppable/", "Chrome");
	}
	
	@Test
	public void dragDrop(){
		//Test for drag and drop operation.
		//Verify operation is successful by comparing the css property and text of elements.
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		//css propertiy/text before drag and drop.
		String colorBeforeDrop = target.getCssValue("color");
		String textBeforeDrop = target.getText();
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();;	
		
		//css property/text after drag and drop
		String colorAfterDrop = target.getCssValue("color");
		String textAfterDrop = target.getText();
		
		Assert.assertNotEquals(colorBeforeDrop, colorAfterDrop);
		Assert.assertNotEquals(textBeforeDrop, textAfterDrop);
	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.close();
	}
	


}
