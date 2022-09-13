Feature: Verifying Facebook login details
Scenario: Verifying facebook login with valid crementials
Given User is on the facebook page
When User should enter username and password
And User should click login button
Then User should verify success msg

