package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	protected static WebDriver driver;
	
	@BeforeSuite
	public void initializeBrowser() {
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\charu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver  = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://qa.freightclub.com/Account/Login?ReturnUrl=%2FWelcome%2FStart");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public  void quickBrowser() {
		driver.quit();
	}
}
