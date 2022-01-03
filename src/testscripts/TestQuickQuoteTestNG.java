package testscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import core.BaseTest;
import testpages.QuickQuotePage;

public class TestQuickQuoteTestNG extends BaseTest {
	
	@Test
	public void testQuickQuote() {
		
		QuickQuotePage obj = new QuickQuotePage(driver);
		obj.clickQuickQuoteLink();
		obj.setPONumber("Test Customer PO");
	}
}
