Feature: test all submodule under fleet  shows correct title

  Scenario Outline:
    Given User is on login page
    When user provide valid "<userName>" and "<password>"
    And user clicks on "<module>" and "<subModule>" name
    Then user should see correct "<title>" on left top of the page
    Examples:
      | userName | password    | module     | subModule       | title           |
      | user1    | UserUser123 | Fleet      | Vehicles        | Car             |
      | user2    | UserUser123 | Customers  | Accounts        | Accounts        |
      | user3    | UserUser123 | Activities | Calendar Events | Calendar Events |



   

