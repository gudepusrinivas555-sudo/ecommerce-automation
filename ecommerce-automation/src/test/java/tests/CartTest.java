package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductPage;
import utils.ConfigReader;

public class CartTest extends BaseTest {
	
	   @Test
	   public void addProducToCartTest() {
		      LoginPage login = new LoginPage(driver);
		      login.login(
		    		 ConfigReader.get("username"),
		    		 ConfigReader.get("password")
		    		 		
		    		 );
		           
		      ProductPage product = new ProductPage(driver);
		      product.addFirstProductToCart();
		      product.openCart();
		      
		      CartPage cart = new CartPage(driver);
		      Assert.assertTrue(cart.isItemPresent());
	   }
	   

}
