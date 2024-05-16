Feature: Shopping Cart
  As a user
  I want to add books to my shopping cart
  So that I can purchase them later

  Scenario: Add book to shopping cart
    Given I am logged in to the online bookstore
    When I search for a book titled "The Great Gatsby"
    And I select the book from the search results
    And I add the book to the shopping cart
    Then the book should be added to my shopping cart
