Feature: Login functionality

Scenario: Valid Login
Given user logs into parabank with valid credentials
Then user should see welcome message

Scenario: Invalid Login
Given user logs into parabank with invalid credentials
Then login error should be displayed
