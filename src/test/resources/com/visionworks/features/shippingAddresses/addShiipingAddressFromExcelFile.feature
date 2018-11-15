Feature: Shipping Addresses
@addShippingAddressFromExcel
Scenario: Add a new shipping address
	Given user signs in to the account
	Then user clicks on My Account
	Then user clicks on Manage Addresses
	And user clicks on Add New Address button
	Then user fills all information from Excel file
    And user clicks on Save button
    