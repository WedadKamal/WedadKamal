@smoke


Feature: F03_currencies | users could select Euro Currency
  Scenario: guest user could select Euro Currency successfully

When Select Euro currency from the dropdown list on the top left of home page
Then Euro Symbol is shown on the 4 products displayed in Home page
