Feature: Free CRM Contact Page Functionality

Scenario Outline: Verify create new contacts functionality

Given user is already on Login Page
When title of login page is Cogmento CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
And user is on home page
Then user click on Contact option from options
Then user click on New button to create contact
Then user enters details "<firstname>" and "<lastname>"
Then user click on Save button
Then user close browser

Examples:
	|	username	|	password	|	firstname	|	lastname	|
	|	vighnaharta.rupesh@gmail.com	|	rudra@1911	|	Tom		|	Hank	|
	|	vighnaharta.rupesh@gmail.com	|	rudra@1911	|	Chris	|	Einstein	|
	