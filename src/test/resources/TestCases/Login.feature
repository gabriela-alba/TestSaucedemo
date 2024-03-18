@Login
Feature: Verify login Saucedemo page

	Background: Verify login with valid and invalid data
	
	Given User is on login page

  @positive
  Scenario Outline: Login With Valid Data
		
		When User input "standard_user" as username "secret_sauce" as password
		And Click on Login button
		Then User is navigate to Home page
	
	@negative
  Scenario Outline: Login With Invalid Data
 
    When User input "<username>" as username "<password>" as password
    And Click on Login button
    Then User get "<error>" as error message
    

    Examples: Credentials Data
      | username        | password    | error |
      |                 |             | Epic sadface: Username is required|
      | locked_out_user |             | Epic sadface: Password is required|
      |                 | secret_sauc | Epic sadface: Username is required|
      | standard_user   | secret_sauc | Epic sadface: Username and password do not match any user in this service |