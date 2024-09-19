Feature: Test Cogmento application functionality

  Scenario: Validate Login Functionality
    Given user is on login Page
    When user enter valid username and password
    Then user click on login button
