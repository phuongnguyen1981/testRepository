package bdd.test.page;

import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomerPage extends BasePage {


	@When("I input customer name as '$customerName' on Add New Customer page")
	
	public void whenIInputCustomerNameAscustomerNameOnAddNewCustomerPage(String customerName) {
		findElement(By.xpath("//input[@type=\"text\" and @name=\"name\"]")).sendKeys(customerName);
	}

	@When("I select gender as '$gender' on Add New Customer page")
	
	public void whenISelectGenderAsgenderOnAddNewCustomerPage(String gender) {
		if (gender.equalsIgnoreCase("female")) {
			findElement(By.xpath("//input[@type=\"radio\" and @name=\"rad1\"][2]")).click();
		}
		else {
			findElement(By.xpath("//input[@type=\"radio\" and @name=\"rad1\"][1]")).click();

		}
	}

	@When("I input DOB as '$DOB' on Add New Customer page")
	
	public void whenIInputDOBAsDOBOnAddNewCustomerPage(String DOB) {
		findElement(By.xpath("//input[@type=\"date\" and @name=\"dob\"]")).sendKeys(DOB);
	}

	@When("I input address as '$address' on Add New Customer page")
	
	public void whenIInputAddressAsaddressOnAddNewCustomerPage(String address) {
		findElement(By.xpath("//textarea[@name=\"addr\"]")).sendKeys(address);
	}

	@When("I input city as '$city' on Add New Customer page")
	
	public void whenIInputCityAscityOnAddNewCustomerPage(String city) {
		findElement(By.xpath("//input[@type=\"text\" and @name=\"city\"]")).sendKeys(city);
	}

	@When("I input state as '$state' on Add New Customer page")
	
	public void whenIInputStateAsstateOnAddNewCustomerPage(String state) {
		findElement(By.xpath("//input[@type=\"text\" and @name=\"state\"]")).sendKeys(state);
	}

	@When("I input PIN as '$PIN' on Add New Customer page")
	
	public void whenIInputPINAsPINOnAddNewCustomerPage(String pinno) {
		findElement(By.xpath("//input[@type=\"text\" and @name=\"pinno\"]")).sendKeys(pinno);
	}

	@When("I input moNo as '$moNo' on Add New Customer page")
	
	public void whenIInputMoNoAsmoNoOnAddNewCustomerPage(String moNo) {
		findElement(By.xpath("//input[@type=\"text\" and @name=\"telephoneno\"]")).sendKeys(moNo);
	}

	@When("I input email as '$email' on Add New Customer page")
	
	public void whenIInputEmailAsemailOnAddNewCustomerPage(String email) {
		findElement(By.xpath("//input[@type=\"text\" and @name=\"emailid\"]")).sendKeys(email);
	}

	@When("I click Submit button on Add New Customer page")
	
	public void whenIClickSubmitButtonOnAddNewCustomerPage() {
	  // PENDING
	}
	public void createCustomer() {
		// TODO Auto-generated method stub

	}

	public String getCustomerId() {
		String customerID = null; // getCustomer Id
		return customerID;
	}
	
	
	

}
