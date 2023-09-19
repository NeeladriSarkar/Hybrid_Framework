package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BulkOrdersPage {

	public WebDriver driver;
	public BulkOrdersPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By img = By.cssSelector("img[class='_2nxI4']");
	public WebElement getImage() {
		List<WebElement> l = driver.findElements(img);
		return l.get(1);
	}
	
}
