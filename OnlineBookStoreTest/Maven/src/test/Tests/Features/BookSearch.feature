Feature: Shopping for a book on the Online Bookstore

  Scenario: Verify that user is able to Purchase a book
    Given I am on the homepage of the online bookstore
    When I search for a book titled "The Great Gatsby"
    And I select the book from the search results
    And I view the detail page of the book
    And I add the book to the shopping cart
    And I navigate to the shopping cart page
    And I proceed to the checkout page
    And I enter my billing and shipping details
    And I place the order
    Then I should receive a confirmation message
