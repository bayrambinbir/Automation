Feature: Viewing brands 
@viewingBrand
Scenario: User wants to see all glasses for a brand 
	Given user signs in to the account 
	Then user clicks on Brands top tab 
	And user selects a brand
	Then user should see all glasses available for chosen brand
	Then user chooses newest glasses from the drop down filter
	Then user sees the price and name of first three glasses- from left to right