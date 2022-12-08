@cart
Feature: Verify the selected item in cart

  Scenario Outline: should be displayed selected item in cart
    Given fill the information form with "<country>" "<name>" "<gender>"
    When click on Lets Shop button
    And add first item to the cart
    Then  click on cart button
    And verify the selected product in cart

    Examples:
      | country        | name  | gender |
      | Angola         | James | Male   |
      | American Samoa | Minna | Female |