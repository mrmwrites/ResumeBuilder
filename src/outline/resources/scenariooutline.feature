Feature: Login to the system using different names
Scenario: Testing different scenarios
Scenario Outline: Login to the system
Given user enters <username>
When user clicks <buttonname>
Then display <message>
Examples:
| username | buttonname | message |
| swami | login | login successful |
| Madhu | login | login successful |
| swami | cancel | login failed |
| Madhu | cancel | login failed |