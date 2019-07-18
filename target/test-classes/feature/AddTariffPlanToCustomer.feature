#Add Tariff Plan To customer
@tag
Feature: To test add trariif plan to customer

  @tag2
  Scenario Outline: To verify the Approved and Unapproved Tariff plan
    Given the user is in add Tariff plan to customer page.
    When the user fill in the valid customer ID details."<Customer ID>"
    And the user clicks the Submit button.
    Then the user should see the customer tariff plan generate to customer.

    Examples: 
      | Customer ID |
      |      176433 |
      |      615343 |
