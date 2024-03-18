@Logout
Feature: Verify logout Saucedemo page

  Scenario Outline: Logout of Sauceemo Page
		
        Given User is on login page
		When User input "standard_user" as username "secret_sauce" as password
		And Click on Login button
		Then User is navigate to Home page
        And Click on burger menu
        And Click on Logout
        Then User is on login page