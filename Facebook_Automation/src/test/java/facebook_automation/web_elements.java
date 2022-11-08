package facebook_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class web_elements {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHUBHAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		}
	@Test
	public void DragAndDrop_Method() throws InterruptedException
	{
		driver.get("https://jqueryui.com/droppable");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement des = driver.findElement(By.xpath("//p[text()='Drop here']"));
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.dragAndDrop(src, des).perform();
		//actions.moveToElement(one).clickAndHold().perform();
		//actions.relese(two).perform();
		driver.close();
	}

}
