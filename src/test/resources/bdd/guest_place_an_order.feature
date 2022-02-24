Feature : Place an order

  Scenario: using default payment option
    Given I'm a guest customer
    And My billing details are
      | firstname | lastname | country | address  | city  | state | zip   | email          |
      | John      | Kat      | US      | 12 NY    | Plano | Texas | 75024 | abc@gmail.com  |
    And I have a product in the Cart
    And I'm on the checkout page
    When I provide billing details
      | firstname | lastname | country | address  | city  | state | zip   | email          |
      | John      | Kat      | US      | 12 NY    | Plano | Texas | 75024 | abc@gmail.com  |
    And I place an order
    Then The order should be placed successfully
