Feature: Free CRM Deals Page Functionality

Scenario Outline: Verify create new deal functionality

Given user is already on Login Page
When title of login page is Cogmento CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
And user is on home page
Then user click on Deals option from options
Then user click on New button to create deal
Then user enters deals details "<title>" and "<Probability>" and "<Commission>"
Then user click on Save button
Then user close browser

Examples:
|	username	|	password	|	title	|	Probability	|	Commission	|
|	vighnaharta.rupesh@gmail.com	|	rudra@1911	|	Test1	|	50	|	10	|
|	vighnaharta.rupesh@gmail.com	|	rudra@1911	|	Test2	|	60	|	35	|