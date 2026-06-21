Feature: Product Search

Scenario: To test Search Product functionality

Given User is on application
When User searches for "Apple"
Then Matching "iPhone" products should be displayed
