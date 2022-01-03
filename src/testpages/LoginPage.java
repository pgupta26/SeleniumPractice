package testpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import core.SeleniumOperations;

public class LoginPage {
	
	WebDriver driver;
	
	By userName =  By.id("Email");
	By passWord = By.id("Password");
	By loginButton = By.id("btn-login");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUserName(String UName) {
		driver.findElement(userName).sendKeys(UName);
	}
	
	public void setPassword(String pass) {
		driver.findElement(passWord).sendKeys(pass);
	} 
	
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	

}
