$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/visionworks/features/shippingAddresses/deleteShippingAddress.feature");
formatter.feature({
  "name": "ShippingAddresses",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add a new shipping address",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@deleteShippingAddress"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user signs in to the account",
  "keyword": "Given "
});
formatter.match({
  "location": "accountSettingsStepDefs.user_signs_in_to_the_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on My Account",
  "keyword": "Then "
});
formatter.match({
  "location": "accountSettingsStepDefs.user_clicks_on_My_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Manage Addresses",
  "keyword": "Then "
});
formatter.match({
  "location": "addShippingAddressStepDefs.user_clicks_on_Manage_Addresses()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on delete button to delete the address",
  "keyword": "Then "
});
formatter.match({
  "location": "deleteShippingAddressStepDefs.user_clicks_on_delete_button_to_delete_the_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users sees a prompt saying are you sure to delete this address and click on the delete button",
  "keyword": "Then "
});
formatter.match({
  "location": "deleteShippingAddressStepDefs.users_sees_a_prompt_saying_are_you_sure_to_delete_this_address_and_click_on_the_delete_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});