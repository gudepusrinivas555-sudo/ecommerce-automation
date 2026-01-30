package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductPage;
import utils.ConfigReader;

public class CheckoutTest extends BaseTest {
	    
	   @Test
	   public void checkoutFlowTest() {
		      LoginPage login = new LoginPage(driver);
		      login.login(
		    	    ConfigReader.get("username"),
		    	    ConfigReader.get("password")
		      );
		ProductPage product = new ProductPage(driver);
		product.addFirstProductToCart();
		product.openCart();
		
		CartPage cart = new CartPage(driver);
		cart.clickCheckout();
		
		CheckoutPage checkout = new CheckoutPage(driver);
		checkout.fillDetails();
		checkout.finishOrder();
		Assert.assertTrue(checkout.isOrderSuccess());
	   }

}
