import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\charu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa.freightclub.com/Account/Login?ReturnUrl=%2FWelcome%2FStart");
		
		WebElement userName = driver.findElement(By.id("Email"));
		userName.sendKeys("freightclubinfo@gmail.com");

		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("Welcome@1");
		
		WebElement loginButton = driver.findElement(By.id("btn-login"));
		loginButton.click();
		
		String actualTitle = driver.getTitle();
		if(actualTitle.equals("Order Management - Freight Club")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		driver.quit();
	}

}
