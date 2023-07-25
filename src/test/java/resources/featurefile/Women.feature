@regression
Feature: Online Shopping
  As user I want to search Women Product on magento website
  Background: I am on homepage

  @smoke
  Scenario: User Should verify The Sort By Product Name Filter

    When I Mouse Hover on Women menu tops and Click on Jackets
    And I Select Sort By filter “Product Name”
    Then I Verify the products name display in alphabetical order

    @sanity
    Scenario: User Should verify The Sort By Price Filter

      When I Mouse Hover on Women menu tops and Click on Jackets
      And I Select Sort By filter “Price”
      Then Verify the products price display in Low to High