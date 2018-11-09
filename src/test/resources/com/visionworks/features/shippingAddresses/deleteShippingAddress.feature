Feature: Shipping Addresses
@deleteShippingAddress
Scenario: Add a new shipping address
	Given user signs in to the account
	Then user clicks on My Account
	Then user clicks on Manage Addresses
	Then user clicks on delete button to delete the address
	Then users sees a prompt saying are you sure to delete this address and click on the delete button