#Pay Billing
@tag
Feature: To test the pay billin g fuctionality

  @tag2
  Scenario Outline: To generate the sucessful billing
    Given the user is in add Pay Billing page.
    When the user fill in the valid customer ID. "<Customer ID>"
    And the user clicks the submit button.
    Then the user should see the payment detail page is generate.

     Examples: 
      | Customer ID |
      |      176433 |
      |      615343 |
