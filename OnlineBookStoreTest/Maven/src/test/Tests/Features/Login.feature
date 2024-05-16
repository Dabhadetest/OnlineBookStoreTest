Feature: Login to Online Bookstore
  As a registered user
  I want to be able to login to the online bookstore
  So that I can access my account and purchase books

  Scenario: Successful Login
    Given I am on the login page
    When I enter my username as "myusername" and password as "mypassword"
    And I click on the login button
    Then I should be logged in successfully

  Scenario: Invalid Login
    Given I am on the login page
    When I enter my username as "invalidusername" and password as "invalidpassword"
    And I click on the login button
    Then I should see an error message