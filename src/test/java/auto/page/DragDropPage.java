package auto.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DragDropPage extends BasePage{

//	public DragDropPage(WebDriver driver) {
//		super(driver);
//		// TODO Auto-generated constructor stub
//		
//	}
//	
//	//By btn5000 = By.xpath("//li[@id=\"fourth\"]/a[normalize-space(text())=\"5000\"]");
//	//By txtSALES = By.xpath("//li[@id=\"credit1\"]/a[normalize-space(text())=\"SALES\"]");
//	//By BANK = By.xpath("//li[@id=\"credit2\"]/a[normalize-space(text())=\"BANK\"]");
//	//private String targetBox = "//*[normalize-space(text())=\"%s SIDE\"]/following-sibling::*//*[normalize-space(text())=\"%s\"]/following-sibling::*/*[contains(@class,\"ui-droppable\")]";
//	
//	private String sourceBtn = "//li[@id=\"fourth\"]/*[normalize-space(text())=\"%s\"]";
//	private String targetBox = "//*[normalize-space(text())=\"%s SIDE\"]/following-sibling::*//*[normalize-space(text())=\"%s\"]/following-sibling::*//*[contains(@class,\"ui-droppable\")]";
//	
//	public void dragToBox(String sourceBtnName, String cardType, String targetType) {
//		
//		String sourceBtnPath = String.format(sourceBtn, sourceBtnName.toUpperCase());
//		WebElement sourceElement = findElement(By.xpath(sourceBtnName));
//		
//		String boxPath = String.format(targetBox, cardType.toUpperCase(), targetType);
//		WebElement targetElement = findElement(By.xpath(boxPath));
//		
//		dragAndDrop(sourceElement, targetElement);
//	}
	public DragDropPage(WebDriver driver) {
		super(driver);
	}

	private String sourceBtn = "//li[@id=\"fourth\"]/*[normalize-space(text())=\"%s\"]";
	private String targetBox = "//*[normalize-space(text())=\"%s SIDE\"]/following-sibling::*//*[normalize-space(text())=\"%s\"]/following-sibling::*//*[contains(@class,\"ui-droppable\")]";

	public void dragToBox(String sourceBtnName, String cardType, String targetType) {
		String sourceBtnPath = String.format(sourceBtn, sourceBtnName.toUpperCase());
		WebElement sourceElement = findElement(By.xpath(sourceBtnPath));

		String boxPath = String.format(targetBox, cardType.toUpperCase(), targetType);
		WebElement targetElement = findElement(By.xpath(boxPath));

		dragAndDrop(sourceElement, targetElement);

	}
}
