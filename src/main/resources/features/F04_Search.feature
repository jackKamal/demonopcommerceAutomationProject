@smoke

Feature: F04_Search | user could search
  Scenario: user could search for product using product name
    Given user search for "Nike"
    When  user clicks on search button
    Then  verify that the url will contains Nike
    And   verify that search shows relevant results

  Scenario: user could search for product using sku
    Given user search for "AP_MBP_13"
    When  user clicks on search button
    And   click on the product in search result
    Then  verify that  the sku shown in this page will be AP_MBP_13


