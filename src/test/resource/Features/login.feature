
@Completetest

Feature: Login to Retail website  

Background:
  Given User is on Retail Website
  @login  
  
 Scenario: Loing to MyAccount 
	When User click on MyAccount
	And  User click on Login
	And User enter userName '<userName>' and password '<password>'
	And User click on Login button
	Then User should be logged in to myAccount Dashboard


# In feature will be use a comment 
#Every Feature file starts with Feature: <Name of Feature>

@test
Scenario Outline: Login to MyAccount with Multiple users


	When User click on MyAccount
	And  User click on Login
	And User enter userName '<userName>' and password '<password>'
	And User click on Login button
	Then User should be logged in to myAccount Dashboard
	
	Examples: 
	
	|userName|password|
	|eagles@tekschool.us|eagles|
	|hawks@tekschool.us|hawks|
	|falcons@tekschool.us|falcons|
	
	Scenario: Register new user to Retail Website
	When User click on MyAccount
	And User click on Register option
	And User fill the Registration form with below information
	|firstName|lastName|eMail|telephone|password|passwordConfirm|Subscribe|
	|shahir|bond|aahmadi@tekschool.us|2021019911|bond007|bond007|no|
	And User accept the privacy and policy
	And User click on continue button
	Then User should be registered in Retail Website
	
	
	
	
	
	