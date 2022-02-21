Feature : Place an order

  Scenario: using default payment option
    Given I'm a guest customer
    And I have a product in the Cart
    And I'm on the checkout page
    When I provide billing details
    | firstname | lastname | country | address | city  | state | zip | email          |
    | John      | Keat     | US      | 12 NY   | Plano | Texas | 123 | abc@gmail.com  |
    And I place an order
    Then The order should be placed successfully
