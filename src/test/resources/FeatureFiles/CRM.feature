Feature: Test CRM application

  Background: 
    Given Open CRM Home page
    When User click on SignIn

  Scenario: Test signIn link fuctionality
    #When User click on SignIn
    Then Application should navigate to login page

  Scenario: Test Crm Login functionality
    #When User click on SignIn
    When User enter valid "test@gmail.com" and valid password "test123"
    And User click on submit button
    Then User should able to login and navigated to customers page
