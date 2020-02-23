package openSourcePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OpenSourceLoginPage extends OpenSourceBasePage {
WebDriver driver;
	
	public OpenSourceLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "user_login")
	WebElement UserName;
	@FindBy(how = How.ID, using = "user_pass")
	WebElement Password;
	@FindBy(how = How.ID, using = "wp-submit")
	WebElement LogInButton;
	
	public void enterUsername (String userName) {
		UserName.sendKeys(userName);
	}
	public void enterPassword (String passWord) {	
		Password.sendKeys(passWord);
	}	
	public void clickSignIn () {	
		LogInButton.click();
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
}
