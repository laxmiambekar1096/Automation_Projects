Feature: Checkout Functionality

Scenario: To test Place Order functionality

Given User has added product to cart
When User proceeds to checkout
And User enters shipping information
And User places order
Then Order should be placed successfully