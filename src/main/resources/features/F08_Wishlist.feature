@smoke
Feature: F08_Wishlist | users could select wishlist button ❤ on this product "HTC One M8 Android L 5.0 Lollipop"
  Scenario: user could select wishlist button ❤ on this product "HTC One M8 Android L 5.0 Lollipop"
    When user select wishlist button ❤ on this product "HTC One M8 Android L 5.0 Lollipop"
    Then success message "The product has been added to your wishlist" with green background color appears


  Scenario: user could select wishlist button ❤ and verify the wish list tap
    When user select wishlist button ❤ on this product "HTC One M8 Android L 5.0 Lollipop"
    And user select wishlist tap after success Message disappears
    Then user could get quantity value from wish list tap
