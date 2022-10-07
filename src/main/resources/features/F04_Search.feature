@smoke

Feature: F04_Search | users could search using product name and sku.
  Scenario Outline: user could search using product "<name>"
    When user could search using product "<name>"
    Then user navigated to another search link with product "<name>"
    Examples:
      | name |
      | Book |
      | Laptop |
      | Nike |


  Scenario Outline: user could search for product using sku "<SKU>"
    When user could search using product "<SKU>"
    And user could click on product
    Then selected product "<SKU>" is shown
    Examples:
      | SKU |
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PRO_11 |

