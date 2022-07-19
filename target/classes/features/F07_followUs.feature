@smoke
Feature: F07_FollowUs   | users could open followUs links
  Scenario:user opens facebook
    Given user opens facebook link
    When assert current url "https://www.facebook.com/nopCommerce"
    Then close current link and return to home page
  Scenario:user opens twitter
    Given user opens twitter link
    When assert current url "https://twitter.com/nopCommerce"
    Then close current link and return to home page
  Scenario:user opens rss
    Given user opens rss link
    When assert current url "https://demo.nopcommerce.com/new-online-store-is-open"
    Then close current link and return to home page
  Scenario:user opens youtube
    Given user opens youtube link
    When assert current url "https://www.youtube.com/user/nopCommerce"
    Then close current link and return to home page