Feature: Add to cart

    Scenario: Add One quantity from store
      Given I'm on the Store page
      When I add a "Blue Shoes" to the Cart
      Then I should see 1 "Blue Shoes" in the cart
