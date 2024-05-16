Feature: User Registration
  As a new user
  I want to register on the online bookstore
  So that I can create an account and make purchases

  Scenario Outline: User registration with valid and invalid details
    Given I am on the registration page
    When I fill in the registration form with "<username>", "<email>", and "<password>"
    And I submit the registration form
    Then I should see "<expected_result>"

    Examples:
      | username     | email                  | password    | expected_result                          |
      | valid_user   | valid_user@example.com | valid_pass  | redirected to home page or confirmation  |
      | invalid_user | invalid_email.com      | invalid     | error message indicating invalid email   |
      | empty_fields |                        |             | error message indicating missing fields  |

