package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	   
	   @Test
	   public void validLoginTest() {
		      LoginPage lp = new LoginPage(driver);
		      lp.login("standard_user", "secret_sauce");
		      
		      Assert.assertTrue(driver.getCurrentUrl().contains("inventory "));
		   
	   }

}
