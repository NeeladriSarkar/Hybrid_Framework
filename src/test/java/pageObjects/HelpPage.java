package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelpPage {

	public WebDriver driver;
	public HelpPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By text = By.xpath("//h1[contains(text(),'Help Center')]");
	public WebElement verifyHelpCenter() {
		return driver.findElement(text);
	}
	
}
