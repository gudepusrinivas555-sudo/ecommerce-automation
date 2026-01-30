package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	   public static WebDriver driver;
	   
	   public static WebDriver initdriver() {
		      String browser = ConfigReader.get("browser");
			  
		      if (browser.equalsIgnoreCase("chrome")) {
		    	  WebDriverManager.chromedriver().setup();
		    	  driver = new ChromeDriver();
		      } else {
		    	   WebDriverManager.edgedriver().setup();
		    	   driver = new EdgeDriver();
		      }
		      driver.manage().window().maximize();
		      driver.get(ConfigReader.get("url"));
		      
		    
		      System.out.println("URL from config: " + ConfigReader.get("url"));
		      driver.get("https://www.saucedemo.com");
		      
		      return driver;
	   }

}
