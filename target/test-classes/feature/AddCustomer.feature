#Add Customer
@tag
Feature: To test the add customer functionality

  @tag1 @smoke
  Scenario: To test generate the add customer page
    Given the user is in add customer page.
    When the user fill in the valid customer details.
      | firstName   | gayathri        |
      | lastName    | Raghuvaran       |
      | emailAdress | test@gmail.com |
      | address     | chennai        |
      | phoneNum    |        7708654|
    And the user clicks the SUBMIT button.
    Then the user should see the customer id generate.

  @tag2 @regression @smoke
  Scenario: To test generate the add customer page
    Given the user is in add customer page.
    When the user fill in the valid customer details.
      | firstName   | gayathri        |
      | lastName    | Raghuvaran       |
      | emailAdress | test@gmail.com |
      | address     | chennai        |
      | phoneNum    |        7708654|
    And the user clicks the SUBMIT button.
    Then the user should see the customer id generate.

  @tag3
  Scenario: To test generate the add customer page
    Given the user is in add customer page.
    When the user fill in the valid customer details.
      | firstName   | gayathri        |
      | lastName    | Raghuvaran       |
      | emailAdress | test@gmail.com |
      | address     | chennai        |
      | phoneNum    |        7708654|
    And the user clicks the SUBMIT button.
    Then the user should see the customer id generate.

  @tag4
  Scenario: To test generate the add customer page
    Given the user is in add customer page.
    When the user fill in the valid customer details.
      | firstName   | gayathri        |
      | lastName    | Raghuvaran       |
      | emailAdress | test@gmail.com |
      | address     | chennai        |
      | phoneNum    |        7708654|
    And the user clicks the SUBMIT button.
    Then the user should see the customer id generate.
