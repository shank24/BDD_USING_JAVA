Feature: Add to cart

  Scenario: Add One quantity from store
    Given I'm on the Store page
    When I add a "Blue Shoes" to the Cart
    Then I should see 1 "Blue Shoes" in the cart

  Scenario: using default payment option
    Given I'm a guest customer
    And I have a product in the Cart
    And I'm on the checkout page
    When I provide billing details
      | firstname | lastname | country | address  | city  | state | zip   | email          |
      | John      | Kat      | US      | 12 NY    | Plano | Texas | 75024 | abc@gmail.com  |
    And I place an order
    Then The order should be placed successfully