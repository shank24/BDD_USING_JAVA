Feature: Add to cart

  Scenario Outline: Add One quantity from store
    Given I'm on the Store page
    When I add a "<product_name>" to the Cart
    Then I should see 1 "<product_name>" in the cart
    Examples:
      | product_name |
      | Blue Shoes   |
      | Basic Blue Jeans |
