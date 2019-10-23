//package demo1;
//
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertEquals;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class ChromeTest extends BaseTest {
//
//	/*
//	 * @Test public void test1() { System.setProperty("webdriver.chrome.driver",
//	 * "/Users/phuongnguyen/Documents/drivers/chromedriver");
//	 * 
//	 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
//	 * 
//	 * driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//	 * 
//	 * driver.navigate().to("http://demo.guru99.com/Agile_Project/Agi_V1/");
//	 * 
//	 * driver.findElement(By.name("uid")).sendKeys("1303");
//	 * driver.findElement(By.name("password")).sendKeys("Guru99");
//	 * driver.findElement(By.name("btnLogin")).click();
//	 * 
//	 * WebElement logoutlink = driver.findElement(By.xpath("//*[text='Log out']"));
//	 * assertNotNull(logoutlink);
//	 * 
//	 * driver.quit();
//	 * 
//	 * }
//	 */
//
////	@Test
////	public void test2() {
////
////		driver.navigate().to("http://demo.guru99.com/Agile_Project/Agi_V1/");
////
////		driver.findElement(By.name("uid")).sendKeys("1303");
////		driver.findElement(By.name("password")).sendKeys("Guru99");
////		driver.findElement(By.name("btnLogin")).click();
////
////		//WebElement logoutlink = driver.findElement(By.xpath("//*[text='Log out']"));
////		//logoutlink.click();
////		//assertNotNull("Log out not exist", logoutlink);
////		
////		
////		WebElement miniStatementLink = driver.findElement(By.xpath("//*[text='Mini Statement']"));
////		miniStatementLink.click();
////		
////		WebElement accountNo = driver.findElement(By.name("accountno"));
////		accountNo.click();
////		driver.findElement(By.xpath("//*[.=\"3308\"]")).click();
////		driver.findElement(By.name("AccSubmit")).click();
////		//WebElement headerTxt1 = driver.findElement(By.xpath("//*[text=\"Last Three Transaction Details for Account No: 3308\"]"));
////		//headerTxt1.
////		assertNotNull("Last Three Transaction Details for Account No: 33");
////		
////		
////	}
//
////	@Test
////	public void test3() {
////		driver.navigate().to("http://demo.guru99.com/test/radio.html");
////		findElement(By.xpath("//input[@type=\"radio\" and @name='webform' and @value='Option 1']")).click();
////		findElement(By.xpath("//input[@type=\"checkbox\" and @name='webform' and @value='checkbox2']")).click();
////		wait(10);
////		// System.out.println("000");
////
////	}
////
////	@Test
////	public void test4_TableDemo() {
////		// TODO Auto-generated method stub
////		driver.navigate().to("http://demo.guru99.com/test/table.html");
////		findElement(By.xpath("//td[text()=\"4\"]/following-sibling::td[1]"));
////
////	}
//
////	@Test
////	public void test5a_Login() {
////		driver.navigate().to("http://demo.guru99.com/V2/index.php");
////		findElement(By.xpath("//input[@type=\"text\" and @name=\"uid\"]")).sendKeys("mngr223395");
////		findElement(By.xpath("//input[@type=\"password\" and @name=\"password\"]")).sendKeys("YnEbEsa");
////
////	}
//
//	@Test
//	public void test5_logIn_createCustomer() {
//		driver.navigate().to("http://demo.guru99.com/V2/index.php");
//		findElement(By.xpath("//input[@type=\"text\" and @name=\"uid\"]")).sendKeys("mngr223395");
//		findElement(By.xpath("//input[@type=\"password\" and @name=\"password\"]")).sendKeys("YnEbEsa");
//
//		//driver.navigate().to("http://demo.guru99.com/V2/webpages/addcustomerpage.php");
//		findElement(By.xpath("//a[text()=\"New Customer\"]")).click();
//
//		findElement(By.xpath("//input[@type=\"text\" and @name=\"name\"]")).sendKeys("PhuongNguyen");
//
//		findElement(By.xpath("//input[@type=\"radio\" and @name=\"rad1\"][2]")).click();
//
//		// input[@type="radio" and @name="rad1"]/following-sibling::text()="female"
//
//		findElement(By.xpath("//input[@type=\"date\" and @name=\"dob\"]")).sendKeys("09/04/1981");
//
//		findElement(By.xpath("//textarea[@name=\"addr\"]")).sendKeys("72 Le Thanh Ton");
//
//		findElement(By.xpath("//input[@type=\"text\" and @name=\"city\"]")).sendKeys("HoChiMinh");
//
//		findElement(By.xpath("//input[@type=\"text\" and @name=\"state\"]")).sendKeys("HCM");
//
//		findElement(By.xpath("//input[@type=\"text\" and @name=\"pinno\"]")).sendKeys("999999");
//
//		findElement(By.xpath("//input[@type=\"text\" and @name=\"telephoneno\"]")).sendKeys("+84966833799");
//
//		findElement(By.xpath("//input[@type=\"text\" and @name=\"emailid\"]")).sendKeys("phuongnguyen4981@gmail.com");
//
//		findElement(By.xpath("//input[@type=\"submit\" and @name=\"sub\"]")).click();
//
//		wait(30);
//
//	}
//
//	@Test
//	public void test6_createAccount() {
//		driver.navigate().to("http://demo.guru99.com/V2/webpages/addAccount.php");
//
//		findElement(By.xpath("//input[@type=\"text\" and @name=\"cusid\"]")).sendKeys("PhuongNguyen");
//
//		findElement(By.xpath("//select[@name=\"selaccount\"]")).click();
//
//		findElement(By.xpath("//option[@value=\"Current\"]")).click();
//
//		findElement(By.xpath("//input[@type=\"text\" and @name=\"inideposit\"]")).sendKeys("1000000");
//
//		findElement(By.xpath("//input[@type=\"submit\" and @name=\"button2\" and @value=\"submit\"]")).click();
//
//		wait(30);
//
//	}
//
//}
