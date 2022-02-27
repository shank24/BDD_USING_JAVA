Feature: Place an order

  Scenario: using default payment option
    Given I'm a guest customer
    And My billing details are
      | firstname | lastname | country            | address     | city  | state | zip   | email              |
      | demo      | user     | United States (US) | 6300 Spring Creek | Plano | Texas | 75024 | askomdch@gmail.com |
    And I have a product in the Cart
    And I'm on the checkout page
    When I provide billing details
    And I place an order
    Then The order should be placed successfully
