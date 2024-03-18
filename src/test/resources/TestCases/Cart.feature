@Cart
Feature: Shopping cart
	As a user I want to add or remove item from cart
  
  Background: Steps common for all scenrios
  
  Given User is on login page
  When User input "standard_user" as username "secret_sauce" as password
  And Click on Login button
	Then User is navigate to Home page

  @positive
  Scenario Outline: Add item to cart 
    
		And Add an "<item>" as an item to the cart
		
		Examples: Items
      |         item          |
      | Sauce Labs Backpack   |
      | Sauce Labs Bike Light |
	
  @negative
  Scenario: Remove item from cart
    When Add an "Sauce Labs Backpack" as an item to the cart
    And User navigate to cart page
    Then User remove first item in cart
