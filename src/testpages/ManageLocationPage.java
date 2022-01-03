package testpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManageLocationPage {
	
	By manageLocationLin = By.xpath("//a[@href='/Profile/Locations']");
	By addLocationButton = By.xpath("//button[@class='btn btn-primary btn-sm margin-bottom-20 width-100-pct']");
	By locationName = By.xpath("//input[@id='Name']");
	
	
	
	
	WebDriver driver;
	
	public ManageLocationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickManageLocationLink() {
		driver.findElement(manageLocationLin).click();
	}
	
	public void clickAddNewLocation() {
		driver.findElement(addLocationButton).click();
	}
	
	public void setLocationName(String LocationName) {
		driver.findElement(locationName).sendKeys(LocationName);
	}

}
