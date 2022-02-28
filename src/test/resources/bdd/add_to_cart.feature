#For Junit
#Feature file will run in parallel,
# and Scenario runs in sequential order,
# when using surefire-plugin.

Feature: Add to cart

  Scenario Outline: Add One quantity from store
    Given I'm on the Store page
    When I add a "<product_name>" to the Cart
    Then I should see 1 "<product_name>" in the cart
    Examples:
      | product_name |
      | Blue Shoes   |
      | Basic Blue Jeans |


#For Test NG
#Scenarios and 'Scenario-outline' are executed
# in multiple threads in parallel.
