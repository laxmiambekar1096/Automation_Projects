Feature: Login Functionality

Scenario: To Test Login functionality with valid username and valid password
	Given User opens login page
	When User enters username and password
	And Clicks on login button
	Then User is redirected to dashboard or home page