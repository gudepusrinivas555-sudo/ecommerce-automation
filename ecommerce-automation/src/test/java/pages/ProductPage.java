package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	   
	  WebDriver driver;
	  
	  By firstAddToCart = By.xpath("//button[conains(text(),Add to cart')[1]");
	  By cartIcon = By.className("shoping_cart_link");
	  
	  public ProductPage(WebDriver driver) {
		    this.driver = driver;
	  }
	  
	  public void addFirstProductToCart() {
		     driver.findElement(firstAddToCart).click();
	 }
	 
	 public void openCart() {
		    driver.findElement(cartIcon).click();
	 }

}
