Feature: Shopping on a website
  

Scenario: Browse the items available on the website
  Given the correct web address
  When I navigate to the 'Menu' page
  Then I can browse a list of the available products.

Scenario: Scroll down to select item
When I navigate down
Then I select Item

Scenario: Add to cart
When I select quantity
And I select size
Then Add to bag