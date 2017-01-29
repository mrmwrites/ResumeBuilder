Feature: Login
As a job seeker I want to login to resumemanager
So that I can see all available jobs for me
Scenario: Valid login using username
Given I have entered "naveenhome" as username and password is "xyz"
When Click on "Login"
Then System display message "Login successful" on "home" page

Scenario: Valid login using username
Given I have entered "naveenhome" as username and password is "xyz"
When Click on "Cancel"
Then System display message do nothing and clear all date