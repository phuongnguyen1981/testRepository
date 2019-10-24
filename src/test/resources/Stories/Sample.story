Sample story

Narrative:
In order to communicate effectively to the business some functionality
As a development team
I want to use Behaviour-Driven Development

Scenario:  Add new Customer
Given I navigate 'http://demo.guru99.com/V2/webpages/addcustomerpage.php'
When I input customer name as '<customerName>' on Add New Customer page
When I select gender as '<gender>' on Add New Customer page
When I input DOB as '<DOB>' on Add New Customer page
When I input address as '<address>' on Add New Customer page
When I input city as '<city>' on Add New Customer page
When I input state as '<state>' on Add New Customer page
When I input PIN as '<PIN>' on Add New Customer page
When I input moNo as '<moNo>' on Add New Customer page
When I input email as '<email>' on Add New Customer page
When I click Submit button on Add New Customer page
Examples: 
|customerName	|gender	|DOB		|address		|city	|state	|PIN		|moNo			|email					|
|Phuong Nguyen	|female	|01/01/2001	|72 Le Thanh Ton|HCM	|HCM	|123456789	|+84966666666	|phuongnguyen4981@gmail.com|
				 


Scenario:  Add new Account
Meta:
@skip
Given I navigate 'http://demo.guru99.com/V2/webpages/addAccount.php'
When I input customer id as '<customerID>' on Add New Account page
When I input input account type as '<accType>' on Add New Account page
When I input initial deposit as '<initDeposit>' on Add New Account page
When I click Submit button on Add New Account page
Examples: 
|customerID	|accType	|initDeposit|
|123456		|Savings	|2000		|
|abc		|Current	|5000		|