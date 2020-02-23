package openSourceUtil;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import openSourcePage.OpenSourceBasePage;

public class OpenSourceBrowserFactory extends OpenSourceBasePage {
	
	static WebDriver driver;
	
	
	public static WebDriver startBrowser() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");		
		return driver;
	}

}
