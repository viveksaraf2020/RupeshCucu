Feature: Free CRM Login Feature

#Without Examples Keyword
#Scenario: Verify Free CRM Login Page


#Given user is already on Login Page
#When title of login page is Cogmento CRM
#Then user enters "vighnaharta.rupesh@gmail.com" and "rudra@1911"
#Then user clicks on login button
#And user is on home page
#Then user close browser


#With Examples Keyword 
Scenario Outline: Verify Free CRM Login Page


Given user is already on Login Page
When title of login page is Cogmento CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
And user is on home page
Then user close browser

Examples:
	|	username	|	password	|
	|	vighnaharta.rupesh@gmail.com	|	rudra@1911	|
	|	skdfbsdfb@sdfbfs.com	|	reset@asd	|