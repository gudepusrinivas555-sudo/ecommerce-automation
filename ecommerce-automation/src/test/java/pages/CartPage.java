package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	
	   WebDriver driver;
	   
	   By cartItem = By.className("cart_name");
	   By checkoutBtn = By.id("checkout");
	   
	   public CartPage(WebDriver driver) {  
		      this.driver = driver;
	   }
	   
	   public boolean isItemPresent() {
		      return  driver.findElements(cartItem).size() > 0;
	   }
	   
	   public void clickCheckout() {
		      driver.findElement(checkoutBtn).click();
	   }

}
