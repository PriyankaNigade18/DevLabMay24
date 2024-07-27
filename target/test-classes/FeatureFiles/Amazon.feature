@All
Feature: Test Amazon application

  Background: 
    Given Open Amazon application
@HomePage @Regression
  Scenario: Test title of Homepage
    When User get the title
    Then title should matched with Home page title
@BestSeller @Regression
  Scenario: Test title of BestSellers page
    When User open Bestsellers page
    When User get the title of BestSeller
    Then Title should matche with bestsellers page
@Deal @Regression
  Scenario: Test title of Todaysdeal page
    When User open TodaysDeal page
    When User get the title of TodaysDeal
    Then Title should matche with TodaysDealpage
@Mobiles
  Scenario: Test title of Mobiles page
    When User open Mobiles page
    When User get the title of Mobiles
    Then Title should matche with Mobiles page
