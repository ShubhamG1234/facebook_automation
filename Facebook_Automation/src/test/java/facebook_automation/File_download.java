package facebook_automation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class File_download {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHUBHAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		}
	@Test
	public void download () throws InterruptedException, IOException{
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		driver.get("https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.6.0/selenium-server-4.6.0.jar");
		//driver.findElement(By.name("4.6.0")).click();
		//driver.findElement(By.linkText("https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.6.0/selenium-server-4.6.0.jar");
		Thread.sleep(2500);
	}
	
}
