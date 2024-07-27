Feature: Test Ornagehrm application

  Scenario Outline: Test login for data driven
    Given Open Hrm application
    When User enter "<username>" and "<password>"
    When User click on Hrm login
    Then User should able to login and navigated to dashboard only for valid set

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Poonam   | test123  |
      | Admin    | admin123 |
