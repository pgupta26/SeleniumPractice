package testscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import core.BaseTest;
import core.Xls_Reader;
import testpages.LoginPage;

public class TestLoginTestNG extends BaseTest {
	
	@Test
	public void testLogin() {	
		
		LoginPage loginPge = new LoginPage(driver);
		
		Xls_Reader obj = new Xls_Reader(".//testdata//Book1.xlsx");
		
		System.out.println("Total Rows: "+obj.getRowCount("Sheet1"));
		String userName = obj.getCellData("Sheet1", "UserName", 2);
		String passWord = obj.getCellData("Sheet1", "Password", 2);
		
		loginPge.setUserName(userName);
		loginPge.setPassword(passWord);
		loginPge.clickLoginButton();
		String actualTitle = loginPge.getTitle();
		String expectedTitle = "Order Management - Freight Club1";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}
