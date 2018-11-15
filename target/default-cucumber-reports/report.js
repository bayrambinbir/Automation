$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/visionworks/features/shippingAddresses/addShiipingAddressFromExcelFile.feature");
formatter.feature({
  "name": "Shipping Addresses",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add a new shipping address",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@addShippingAddressFromExcel"
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
  "name": "user clicks on Add New Address button",
  "keyword": "And "
});
formatter.match({
  "location": "addShippingAddressStepDefs.user_clicks_on_Add_New_Address_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills all information from Excel file",
  "keyword": "Then "
});
formatter.match({
  "location": "addShippingAdressFromExcelFileStepDefs.user_fills_all_information_from_Excel_file()"
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