package bdd.test.page;

import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

public class NewAccountPage extends BasePage {


	@When("I create an account with '")
	public void createAcc(String customerId) {
		// TODO Auto-generated method stub
		
	}
	
	@When("I input customer id as '$customerID' on Add New Account page")
	
	public void whenIInputCustomerIdAscustomerIDOnAddNewAccountPage(String customerID) {
	  // PENDING
	}

	@When("I input input account type as '$accType' on Add New Account page")
	
	public void whenIInputInputAccountTypeAsaccTypeOnAddNewAccountPage(String accType) {
	  // PENDING
	}

	@When("I input initial deposit as '$initDeposit' on Add New Account page")
	
	public void whenIInputInitialDepositAsinitDepositOnAddNewAccountPage(String initDeposit) {
	  // PENDING
	}

	@When("I click Submit button on Add New Account page")
	
	public void whenIClickSubmitButtonOnAddNewAccountPage() {
	  // PENDING
	}
//
//
//	Example: {customerID=abc, accType=Current, initDeposit=5000}
//	Given I navigate 'http://demo.guru99.com/V2/webpages/addAccount.php'
//	When I input customer id as '<customerID>' on Add New Account page (PENDING)
//	When I input input account type as '<accType>' on Add New Account page (PENDING)
//	When I input initial deposit as '<initDeposit>' on Add New Account page (PENDING)
//	When I click Submit button on Add New Account page (PENDING)
//	@When("I input customer id as '<customerID>' on Add New Account page")
//	@Pending
//	public void whenIInputCustomerIdAscustomerIDOnAddNewAccountPage() {
//	  // PENDING
//	}
//

}
