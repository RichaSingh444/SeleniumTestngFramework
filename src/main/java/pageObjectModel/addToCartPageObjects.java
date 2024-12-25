package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addToCartPageObjects {

	public WebDriver driver; 

	// iphone
	private By iphoneCost = By.xpath("//p[@class='price']");
	private By clickaddCartIphone = By.xpath("(//i[@class='fa fa-shopping-cart'])[3]");

	// Samsung
	private By SamsungCost = By.xpath("(//p[@class='price'])[2]");
	private By clickAddCartSamsung = By.xpath("(//i[@class='fa fa-shopping-cart'])[5]");

	// Cart
	private By GoCart = By.xpath("//span[@id='cart-total']");
	private By cartClick = By.xpath("(//i[@class='fa fa-shopping-cart'])[2]");
	private By TotalText = By.xpath("(//td[@class='text-right'])[12]");

	public addToCartPageObjects(WebDriver driver) {	
		this.driver = driver;
	}

	public WebElement getIphoneCost() {
		return driver.findElement(iphoneCost);
	}

	public WebElement clickaddToCartIphone() {
		return driver.findElement(clickaddCartIphone);
	}

	public WebElement getSamsungCost() {
		return driver.findElement(SamsungCost);
	}

	public WebElement clickaddToCartSamsung() {    
		return driver.findElement(clickAddCartSamsung);
	}

	public WebElement goTocart() {
		return driver.findElement(GoCart);
	}

	public WebElement goTocartClick() {
		return driver.findElement(cartClick);
	}

	public WebElement getTotalText() {
		return driver.findElement(TotalText);
	}

}
