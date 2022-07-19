@smoke
Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
  Given user go to register page
  When user select gender type
  And user enter first name "automation" and last name "tester"
  And user enter date of birth
  And user enter email "test505@example.com" field
  And user fills Password fields "P@ssw0rd" and Confirm password "P@ssw0rd"
  Then user clicks on register button
  And success message is displayed
