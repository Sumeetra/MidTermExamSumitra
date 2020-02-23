package openSourcePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OpenSourceDashBoardPage extends OpenSourceBasePage {
	WebDriver driver;

	
	public OpenSourceDashBoardPage(WebDriver driver) {
	this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//h1[text() = 'Dashboard']")
	WebElement PageTitle;
	@FindBy(how = How.ID, using = "title")
	WebElement AddTitle;
	@FindBy(how = How.ID, using = "content")
	WebElement AddContent;
	@FindBy(how = How.ID, using = "save-post")
	WebElement SaveDraft;

	// Methods to interact with the elements
	public void waitForPage() {
	waitForElement(PageTitle, driver);
	}
	public void titleName(String title) {
		AddTitle.sendKeys(title);
	}
	public void myContent(String content) {
		AddContent.sendKeys(content);
	}
	public void clickOnSaveDraft() {
	SaveDraft.click();
	}

	public boolean isDashboardDisplayed() {
	try {
	waitForPage();
	return true;
	} catch (Exception e) {

	}
	return false;
	}
	}
