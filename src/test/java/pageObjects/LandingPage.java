package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	By track = By.cssSelector("a[title*='Track Order']");
	public WebElement clickTrackOrder() {
		return driver.findElement(track);
	}
	
	By help = By.cssSelector("a[class*='inherit contact-channel']");
	public WebElement clickHelp(){
		List<WebElement> l = driver.findElements(help);
		return l.get(0);
	}
	
	By wishlist = By.cssSelector("a[title*='Wishlist']");
	public WebElement clickWishlist() {
		return driver.findElement(wishlist);
	}
	
	By cart = By.cssSelector("a[title*='Cart']");
	public WebElement clickCart() {
		return driver.findElement(cart);
	}
	
	By search = By.id("search");
	public WebElement searchElement() {
		return driver.findElement(search);
	}
	
	By cusStory = By.cssSelector("a[class*='button-with-border']");
	public WebElement customerStoryClick() {
		return driver.findElement(cusStory);
	}
	
	By stores = By.cssSelector("a[class='featuredLinksBar__link']");
	public WebElement clickStores() {
		List<WebElement> l = driver.findElements(stores);
		return l.get(0);
	}
	
	By bulk = By.cssSelector("a[class='featuredLinksBar__link']");
	public WebElement clickBulkOrder() {
		List<WebElement> l = driver.findElements(bulk);
		return l.get(1);
	}
	
	By gift = By.cssSelector("a[class='featuredLinksBar__link']");
	public WebElement clickGiftCard() {
		List<WebElement> l = driver.findElements(gift);
		return l.get(2);
	}
	
}
