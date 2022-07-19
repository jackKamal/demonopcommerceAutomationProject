@smoke
Feature: F06_home slider | checking home slider functionality
  Scenario: first slider is clickable on home page
    When click on first slider of the nokia-lumia-1020
    Then assert the url of first slider

  Scenario: second slider is clickable on home page
    Given navigate to second slider
    When click on second slider of the iphone-6
    Then assert the url of second slider