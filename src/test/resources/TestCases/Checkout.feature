@Checkout
Feature: Checkout
  User checkout items from cart

  @positive 
  Scenario Outline: Checkout item from cart
  	Given User is on login page
  	When User input "standard_user" as username "secret_sauce" as password
  	And Click on Login button
		Then User is navigate to Home page
    #Add Item
    And Add an "Sauce Labs Backpack" as an item to the cart
    And Add an "Sauce Labs Bike Light" as an item to the cart
    #Going to cart page
    And User navigate to cart page
    #Verifying user on cart page
    Then User already on "Your Cart" as cart page
    #Removing 1 item from cart
    When User remove first item in cart
    #Going to checkout page
    And User navigate to checkout page
    #Input firstName lastName and postalCode
    And User filling "Bruno" as firstName, "Diaz" as lastName and "CG123" as postal code
    #Go to receipt page
    And User navigate to checkout overview page
    #Verify Price
    Then User verify item total and tax price
    #Pay and back to homePage
    And User navigate to checkout complete page and going back to home page

    