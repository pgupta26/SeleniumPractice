package testscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import core.BaseTest;
import testpages.ManageLocationPage;

public class TestAddLocationTestNG extends BaseTest {
	
	@Test
	public void testAddLocation() {
		ManageLocationPage obj =new ManageLocationPage(driver);
		
		obj.clickManageLocationLink();
		obj.clickAddNewLocation();
		obj.setLocationName("Test Location");
		
	}
}
