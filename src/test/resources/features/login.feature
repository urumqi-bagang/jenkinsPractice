Feature: log in with different username and password
  @smoke
  Scenario: User should be able to login with different valid credential
    Given User is on login page
    When user provide different valid credential
    Then user should see be able to login to homepage