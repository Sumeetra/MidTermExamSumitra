package openSourceTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import openSourcePage.OpenSourceBasePage;
import openSourcePage.OpenSourceDashBoardPage;
import openSourcePage.OpenSourceLoginPage;
import openSourceUtil.OpenSourceBrowserFactory;

public class CreateAQuickDraft extends OpenSourceBasePage {

	WebDriver driver;

	@Test(priority = 1)
	public void createQuickDraft() throws InterruptedException {
		driver = OpenSourceBrowserFactory.startBrowser();
		OpenSourceLoginPage loginPage = PageFactory.initElements(driver, OpenSourceLoginPage.class);

		loginPage.enterUsername("opensourcecms");
		loginPage.enterPassword("opensourcecms");
		loginPage.clickSignIn();
			
		OpenSourceDashBoardPage dashboardPage2 = PageFactory.initElements(driver, OpenSourceDashBoardPage.class);

		dashboardPage2.titleName("Everest123");
		dashboardPage2.myContent("For Mid Term Exam");
		dashboardPage2.clickOnSaveDraft();

			Thread.sleep(5000);
		// QuickDraft Validation
		String expectedPost = "Everest123";
		java.util.List<WebElement> descriptionOfElements = driver.findElements(By.xpath("//div[@id='dashboard_quick_press']/descendant::a"));
		Assert.assertTrue(isDescriptionMatch(expectedPost, descriptionOfElements), "QuickDraft unsucessful");
	}

	private boolean isDescriptionMatch(String expectedPost, java.util.List<WebElement> descriptionOfElements) {
		for (int i = 0; i < descriptionOfElements.size(); i++) {
			if (expectedPost.equalsIgnoreCase(descriptionOfElements.get(i).getText())) {
				return true;
	}
	}
		return false;
	}
	}
