@Wong
  Feature: Buying a product in Wong page
    I as an user of Wong page
    Want to buy a product of an item of a wong page
    For make a purchase

  @TestCase1
  Scenario: Making a purchase of an item
    Given He goes to Wong home page
    When He search an item on page
    |item|
    |LED |
    And He select the item
    Then He see the product in cart shop
