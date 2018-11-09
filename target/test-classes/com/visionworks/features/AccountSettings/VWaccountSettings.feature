Feature: Modifying Account Settings

@accountSettings
Scenario: User changes the password
	Given user signs in to the account
	Then user clicks on My Account
	Then user clicks on Account Settings OR Manage Account Settings
	Then user clikcs on the change password buttom to change password
	Then user enters the current password
	Then user enters the new password
	And user confirms the new password
	Then user clicks on saves button
	Then user verifies the confirmation saying that "Your personal information has been successfully updated."