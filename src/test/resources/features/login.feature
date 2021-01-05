Feature: log in with different username and password

  @smoke @Dawud
  Scenario Outline: User should be able to login with different valid credential
    Given User is on login page
    When user provide valid "<userName>" and "<password>"
    Then user should see the correct "<fullName>" appeared in homepage

    Examples:
      | userName        | password    | fullName           |
      | user1           | UserUser123 | John Doe           |
      | user2           | UserUser123 | Mabel Ziemann      |
      | user3           | UserUser123 | Gretchen Stamm     |
      | user4           | UserUser123 | Aleen Williamson   |
      | user5           | UserUser123 | Rhiannon Kertzmann |
      | storemanager51  | UserUser123 | Ruthie Kohler      |
      | storemanager52  | UserUser123 | Lorine Johns       |
      | storemanager54  | UserUser123 | Cathy Leannon      |
      | storemanager55  | UserUser123 | Darien Smitham     |
      | salesmanager103 | UserUser123 | Carmella Bernhard  |
      | salesmanager104 | UserUser123 | Hobart Smith       |
      | salesmanager105 | UserUser123 | Paxton Boyer       |
