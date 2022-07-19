@smoke
Feature: F05_hover Categories | user make actions using hover
  Scenario: user could hover for list of prodect
   Given user hover one of the main categories at home page
   When select one of this sub-category and click on it
   Then assert that the sub-category url is contains the selected sub-category



