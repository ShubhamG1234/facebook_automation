package facebook_automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Javascript_Executor {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHUBHAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		}
	@Test
	public void javascriptExcecutor() throws InterruptedException{
		driver.get("C:\\Users\\SHUBHAM\\Desktop\\TST\\qsp.html\\");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("document.getElementById('t1').value = 'Walter'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t2').value = ''");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t1').value = 'Acivate'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t1').type = 'button'");
	}
}
