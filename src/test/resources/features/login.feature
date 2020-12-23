Feature: log in with different username and password

  @smoke
  Scenario Outline: User should be able to login with different valid credential
    Given User is on login page
    When user provide valid "<userName>" and "<password>"
    Then user should see the correct "<fullName>" appeared in homepage

    Examples:
      | userName        | password    | fullName           |
      | user1           | UserUser123 | John Doe           |
      | user2           | UserUser123 | Mabel Ziemann      |
      | user3           | UserUser123 | Gretchen Stamm     |
      | user4           | UserUser123 | Kyleigh	Reichert   |
      | user5           | UserUser123 | Nona Carroll       |
      | storemanager51  | UserUser123 | Geovany Jenkins    |
      | storemanager52  | UserUser123 | Roma Medhurst      |
      | storemanager53  | UserUser123 | Aditya Rempel      |
      | storemanager54  | UserUser123 | Turner Considine   |
      | storemanager55  | UserUser123 | Rachel Oberbrunner |
      | salesmanager101 | UserUser123 | Peyton Harber      |
      | salesmanager102 | UserUser123 | Patricia Doyle     |
      | salesmanager103 | UserUser123 | Nellie Corwin      |
      | salesmanager104 | UserUser123 | Nikita Wintheiser  |
      | salesmanager105 | UserUser123 | Geraldine Parisian |
