Feature: Test Open Cartv application

  Scenario: Test Register Process for new user
    Given Open Register page
    When User enters all required details
      | fname  | lname  | email            | tele      | pass    | cpass   |
      | Anubha | sharma | anu111@gmail.com | 988766555 | test123 | test123 |
    And User click on yes readio button
    And User click on privacy policy
    And User click on Continue button
    Then User should be register
