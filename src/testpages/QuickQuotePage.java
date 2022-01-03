package testpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QuickQuotePage {
	
	By quickQuoteLink = By.xpath("//a[contains(@href,'/QuickQuote/QuickQuote')]");
	By customerPONumber = By.xpath("//input[@id='OrderReferenceID']");

	
	WebDriver driver;
	
	public QuickQuotePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickQuickQuoteLink() {
		driver.findElement(quickQuoteLink).click();
	}
	
	public void setPONumber(String PONumber) {
		driver.findElement(customerPONumber).sendKeys(PONumber);
	}
	
	
}
