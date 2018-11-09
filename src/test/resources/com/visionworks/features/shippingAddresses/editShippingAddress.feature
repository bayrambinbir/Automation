Feature: Shipping Addresses
@editShippingAddress
Scenario: Editing shipping address
	Given user signs in to the account
	Then user clicks on My Account
	Then user clicks on Manage Addresses
	Then user clicks on edit button to edit the address
	Then user fills all information as follows: Name "Bayram" Last Name "Binbir" PhoneFirstThree "210" PhoneSecondThree "234" PhoneLastFour "2121" Address "175 E Houston St" City "San Antonio" Zip Code "78205" State is TX 
    And user clicks on Save button
  