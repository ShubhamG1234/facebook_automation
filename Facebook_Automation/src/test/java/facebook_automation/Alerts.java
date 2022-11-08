package facebook_automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alerts {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHUBHAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@Test
	public void Alert_confirmation_popup() {
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.id("confirmButton")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
	}
	@Test
	public void Alert_popup_simple_001 ()throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.id("alertButton")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	@Test
	public void Alert_simple_002() {
		driver.get("https://demoqa.com/alerts/");
		driver.manage().window().maximize();
		driver.findElement(By.id("timerAlertButton")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
	}
	@Test
	public void Alert_Promt_popup() {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		JavascriptExecutor javaexe = (JavascriptExecutor)driver;
		javaexe.executeScript("window.scrollBy(0,100)");
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Done");
		alert.accept();
	}
	@Test
	public void Alert_Box() {
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		driver.findElement(By.name("alertbox")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
}
