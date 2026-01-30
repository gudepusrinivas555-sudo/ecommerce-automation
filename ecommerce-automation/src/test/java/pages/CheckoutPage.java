package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	   
	   WebDriver driver;
	   
	   By firstName = By.id("first-name");
	   By lastName = By.id("last-Name");
	   By zip = By.id("postal-code");
	   By continueBtn = By.id("continue");
	   By finishBtn = By.id("finish");
	   By successMsg = By.id("complete-header");
	   
	   public CheckoutPage(WebDriver driver) {
		      this.driver = driver;
	   }
	   
	   public void fillDetails() {
		      driver.findElement(firstName).sendKeys("john");
		      driver.findElement(lastName).sendKeys("Tester");
		      driver.findElement(zip).sendKeys("12345");
		      driver.findElement(continueBtn).click();
	   } 
	   public void finishOrder() {
		      driver.findElement(finishBtn).click();
	   }
	   public boolean isOrderSuccess() {
		      return driver.findElement(successMsg).isDisplayed();     
	   }

}
