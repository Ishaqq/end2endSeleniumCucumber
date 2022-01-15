Feature: Login into application

Scenario Outline: Positive test validating login

Given Initialize the browser with chrome to QA
And Navigate to "http://www.qaclickacademy.com/" site
And Click on login link in home page to land on secure sign in Page
When User enter <email> and <password> and logs in
Then verify that user is succesfully logged in

Examples:
|email  			 | password |
|ishaq8283@gmail.com | ab345678 |
|test@gmail.com  	 | 23ssword |