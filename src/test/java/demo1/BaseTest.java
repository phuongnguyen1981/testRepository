package demo1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseTest {

	protected WebDriver driver;
	
	@BeforeClass
	public static void beforeAll() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/phuongnguyen/Documents/drivers/chromedriver");
	}
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}
	
	public void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch ( InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
	}
	
	@AfterClass
	public static void afterAll() {
		// TODO Auto-generated method stub

	}
	
	@After
	public void teardown() {
		if (driver!=null) {
			driver.quit();
		}
		
	}
	
	protected WebElement findElement (By by) {
		try {
			return driver.findElement(by);
			
		} catch (Exception e) {
			// TODO: handle exception
			
			return null;
			
		}
		
	}

}
