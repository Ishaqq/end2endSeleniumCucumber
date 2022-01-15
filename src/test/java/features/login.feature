Feature: Login into Application

Scenario: Positive test validating login
Given Initialize the browser with chrome
When User enters "JOHN" and "12345678" and logs in
Then Verify that user is succesfully logged in 
And close browsers