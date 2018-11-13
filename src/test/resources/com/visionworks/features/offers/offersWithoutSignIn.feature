Feature: Testing offers 
@offersWitoutSignIn
Scenario: User testing offers 
	Given User clicks on offers top tab 
	Then User enters zip code 
	And User clicks on Go button for zip code 
	Then User sees the map with store locations