@regression
Feature: Online Shopping
  As user I want to search Men Product on magento website

  Background: I am on homepage

  @smoke
  Scenario:User Should Add Product SuccessFully To Shopping Cart

    When I Mouse Hover on Men menu Bottoms and Click on Pants
    And I am Mouse Hover on product name Cronus Yoga Pant
    And I click on size 32
    And I click on colour Black
    And I am Mouse Hover on product
    And I click on Add To Cart Button.
    And I Verify the product message 'You added Cronus Yoga Pant to your shopping cart.'
    And I Click on shopping cart Link into msg
    And I Verify the shopping cart text 'Shopping Cart.'
    And I Verify the products name 'Cronus Yoga Pant'
    And I Verify the product size '32'
    Then I Verify the product colour 'Black'

