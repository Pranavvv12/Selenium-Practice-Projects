Feature: Fund Transfer

Scenario: Successful Fund Transfer
Given user logs into parabank with valid credentials
When user transfers 100 dollars
Then transfer should be successful
