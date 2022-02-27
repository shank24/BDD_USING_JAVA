Feature: Add to cart

  Scenario: Add One quantity from store
    Given I'm on the Store page
    When I add a "Blue Shoes" to the Cart
    Then I should see 1 "Blue Shoes" in the cart



  Scenario Outline: Add One quantity from store - examples
    Given I'm on the Store page
    When I add a "<product_name>" to the Cart
    Then I should see 1 "<product_name>" in the cart
    Examples:
      | product_name |
      | Anchor Bracelet |
      | Basic Blue Jeans |

