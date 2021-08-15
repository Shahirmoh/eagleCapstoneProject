@complete
Feature: Desktop
# In feature will be use a comment 
#Every Feature file starts with Feature: <Name of Feature>
Background:
Given User is on Retail Website



@Destop
Scenario: User verify all items are present in Desktops tab
When User click on Desktops tab 
And User click on ShowAllDesktops


Then User should see all items are present in Desktop page

@Test
Scenario: User add HP LP 3065  from Desktops tab to the cart
When User click on Desktops tab 
And User click on ShowAllDesktops
 
And User click  ADD TO CART option on ‘HP LP3065’ item 
And User select quantity '1' 
And User click add to Cart button 
Then User should see a message ‘Success: you have added HP LP 3065 to your Shopping cart!’

@Canon
Scenario: User add Canon EOS 5D from Desktops tab to the cart
When User click on Desktops tab 
And User click on ShowAllDesktops
And User click  ADD TO CART option on ‘Canon EOS 5D’ item 
And User select color from dropdown ‘Red’
And User select quantity '1' 
And User click add to Cart button 
Then User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’

