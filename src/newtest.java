import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
public class newtest {


	public static void main(String[] args) {

	//stem.setProperty("webdriver.chrome.driver", "C:\\Users\\charu\\Downloads\\chromedriver_win32\\chromedriver.exe");


	System.setProperty("webdriver.chrome.driver", "C:\\Users\\charu\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/"); 	
	
	driver.findElement(By.id("email")).sendKeys("charutayal8@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("Software@12");
	driver.findElement(By.name("login")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@aria-label='Account' and @role='button']")).click();
	driver.findElement(By.xpath("//span[text()='Log Out']")).click();
	}
	
}
