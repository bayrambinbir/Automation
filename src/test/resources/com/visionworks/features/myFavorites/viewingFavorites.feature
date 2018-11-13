Feature: Viewing Favorites 
@viewingFavorites
Scenario: Favorites 
	Given user signs in to the account 
	Given user clicks on My Account main tab 
	Then user clicks on My Favorites
	Then user should see how many favorites that he or she has
	Then user sees the name, original price and reduced priced of the favorite item(s)
	 