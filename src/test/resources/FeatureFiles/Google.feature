Feature: Test google application

  Background: 
    Given Open Google application

  Scenario: Test google application title
    #Given Open Google application
    When user get the actual title
    Then Title should matched with Google

  Scenario: Test google search feature
    #Given Open Google application
    When User search with valid keyword "Cucumber"
    Then User should get valid search result
