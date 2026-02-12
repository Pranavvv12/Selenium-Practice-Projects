Feature: Login functionality

  Scenario: Valid Login
    Given User is on Login Page
    When User enters valid username and password
    Then User should see Products page
