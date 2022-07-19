@smoke
Feature: F08_Wishlist   | add one product to wishlist
  Scenario:goto home page and add "HTC One M8 Android L 5.0 Lollipop" then check assertion
    When click on wishlist button for HTC One M8 Android L 5.0 Lollipop
    Then assertion for wishlist message and background color
  Scenario:goto home page and add "HTC One M8 Android L 5.0 Lollipop" then check wishlist counter for this item biggger than zero
    When click on wishlist button for HTC One M8 Android L 5.0 Lollipop
    And click on wishlist icon
    Then assert number for item selected more than zero