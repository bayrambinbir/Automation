Feature: Viewing all brands of frames
@frameBrands
Scenario: User wants to see all brands of frames available
	Given user signs in to the account 
	Then user clicks on Brands top tab 
	And user clicks on See All Brands
	Then user should see all frame brands
	