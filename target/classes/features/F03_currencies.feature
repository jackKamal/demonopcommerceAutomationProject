@smoke
Feature: F03_currencies | users could change currencies
  Scenario: user could users could change currencies
    Given  user click on currency dropdown list on the top left of home page
    When user select Euro currency from the dropdown list
    Then verify that Euro Symbol € is shown on the 4 products displayed in Home page

