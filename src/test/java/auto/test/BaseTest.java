package auto.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import auto.page.BasePage;
import auto.page.DragDropPage;

public class BaseTest {
	private WebDriver driver;

	protected BasePage basePage;
	protected DragDropPage dragDropPage;

	@BeforeClass // run before all test cases
	public static void beforeAll() {
		System.setProperty("webdriver.chrome.driver", "/Users/phuongnguyen/Documents/drivers/chromedriver");

	}

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/phuongnguyen/Documents/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		basePage = new BasePage(driver);

	}

	protected WebElement findElement(By by) {
		try {
			return driver.findElement(by);
		} catch (Exception e) {
			System.out.print(e);
			return null;
		}
	}

	@AfterClass
	public static void afterAll() {
	}

	@After
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}

	}

}
