Feature: Test Opencart application with basic scenario

  Scenario: Test Login with valid credentials
    Given Open Login page
    When User enter "anu111@gmail.com" and user enter "test123"
    And User click on login button
    Then User should be able to login into cart application
