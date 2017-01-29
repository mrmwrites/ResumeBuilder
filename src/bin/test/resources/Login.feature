Feature: Registration
User should be able to register successfully
Scenario: Saving basic details successfully
Given "Swami" as Name 
And "mrmwrites" as the login user name 
And "swami@mrmwrites.com" as the email address 
And "1234567890" as the mobile number 
And "Swsami 12356, abc st" as the communication address 
And "Swami@12345" as the password
Then System should display the registration successful page

Scenario: When Login Username and Password is same
Given "Swami" as the Name 
And "mrmwrites" as the login user name 
And "swami@mrmwrites.com" as the email address 
And "1234567890" as the mobile number 
And "Swsami 12356, abc st" as the communication address 
And "mrmwrites" as the password
Then System should display an error message that the username and password values are same


Scenario: When Login Username is lessathan 3 characters
Given "Sw" as the Name 
Then System should display an error message saying minimum number of characters for username is 3.


Scenario: extra character in phone number
Given "Swami" as Name 
And "mrmwrites" as the login user name 
And "swami@mrmwrites.com" as the email address 
And "122334567890" as the mobile number 
And "Swsami 12356, abc st" as the communication address 
And "swaminathan" as the password
Then System should display an error message that the phone number is incorrect

Scenario: Email address without TLD
Given "Swami" as Name 
And "mrmwrites" as the login user name 
And "swami@mrmwrites" as the email address 
And "1234567890" as the mobile number 
And "Swsami 12356, abc st" as the communication address 
And "swaminathan" as the password
Then System should display an error message that the format of email address is incorrect