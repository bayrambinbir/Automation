Feature: Testing offers 
@offersWitoutSignIn
Scenario: User testing offers 
	Given User clicks on offers top tab 
	Then user sees the Page title saying "Visionworks Offers, Discounts & Coupons on Glasses | Visionworks"
	Then User enters zip code 
	And User clicks on Go button for zip code 
	Then User sees the map with store locations
	Then user sees how many stores are there in that area