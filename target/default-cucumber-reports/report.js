$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/visionworks/features/shippingAddresses/editShippingAddress.feature");
formatter.feature({
  "name": "Shipping Addresses",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Editing shipping address",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@editShippingAddress"
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
  "name": "user clicks on edit button to edit the address",
  "keyword": "Then "
});
formatter.match({
  "location": "editShippingAddressStepDefs.user_clicks_on_edit_button_to_edit_the_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills all information as follows: Name \"Bayram\" Last Name \"Binbir\" PhoneFirstThree \"210\" PhoneSecondThree \"234\" PhoneLastFour \"2121\" Address \"175 E Houston St\" City \"San Antonio\" Zip Code \"78205\" State is TX",
  "keyword": "Then "
});
formatter.match({
  "location": "addShippingAddressStepDefs.user_fills_all_information_as_follows_Name_Last_Name_PhoneFirstThree_PhoneSecondThree_PhoneLastFour_Address_City_Zip_Code_State_is_TX(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Save button",
  "keyword": "And "
});
formatter.match({
  "location": "addShippingAddressStepDefs.user_clicks_on_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});