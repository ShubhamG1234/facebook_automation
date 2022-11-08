package facebook_automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Robot_Class {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHUBHAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		}
	@Test
	public  void Keyboard_Mouse_Operations() throws InterruptedException, AWTException
	{

	driver.get("http://facebook.com/");
	Thread.sleep(5000);
	//Creating an object of Robot Class
	Robot r = new Robot();
	//move the mouse by x and y coordinate
	r.mouseMove(890, 270);
	//press ALT key from keyboard
	r.keyPress(KeyEvent.VK_ALT);
	//press F key from keyboard
	r.keyPress(KeyEvent.VK_F);
	//Release F key from keyboard
	r.keyRelease(KeyEvent.VK_F);
	//Release Alt key from keyboard
	r.keyRelease(KeyEvent.VK_ALT);
	Thread.sleep(2500);
	//Press W key from keyboard to open a new private window
	r.keyPress(KeyEvent.VK_W);
	//Release W key from keyboard
	r.keyRelease(KeyEvent.VK_W);
	Thread.sleep(3000);
	//driver.close();
	r.mouseMove(930, 350);
	//r.keyPress(KeyEvent.VK_CTRL);
	//r.keyRelease(keyEvent.VK_CTRL);

	}
	@Test
	public void Double_Click_Method() throws InterruptedException{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement MobNum = driver.findElement(By.id("email"));
		WebElement Pass = driver.findElement(By.name("Pass"));
		actions.doubleClick(Pass).perform();
		Thread.sleep(2000);
		actions.doubleClick(MobNum).perform();
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void Keyboard_Method() throws InterruptedException, IOException, AWTException
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement element =driver.findElement(By.partialLinkText("Forgotton Password?"));
		Actions actions =new Actions(driver);
		actions.contextClick(element).perform();
		actions.sendKeys(Keys.DOWN).perform();
		actions.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		driver.close();
	}
	@Test
	public void ContextClick_method() throws InterruptedException{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement mobileNum = driver.findElement(By.xpath("//input[@id='email']"));
		Actions actions =new Actions(driver);
		actions.contextClick(mobileNum).perform();
		Thread.sleep(4000);
		driver.close();
		
	}
}
