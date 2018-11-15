<<<<<<< HEAD
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/visionworks/features/brands/allBrandsFrames.feature");
formatter.feature({
  "name": "Viewing all brands of frames",
=======
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/visionworks/features/shippingAddresses/addShiipingAddressFromExcelFile.feature");
formatter.feature({
  "name": "Shipping Addresses",
>>>>>>> 0938d54ba0410e6dcece98388e3608e51c05a899
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
<<<<<<< HEAD
  "name": "User wants to see all brands of frames available",
=======
  "name": "Add a new shipping address",
>>>>>>> 0938d54ba0410e6dcece98388e3608e51c05a899
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
<<<<<<< HEAD
      "name": "@frameBrands"
=======
      "name": "@addShippingAddressFromExcel"
>>>>>>> 0938d54ba0410e6dcece98388e3608e51c05a899
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
<<<<<<< HEAD
  "name": "user clicks on See All Brands",
  "keyword": "And "
});
formatter.match({
  "location": "frameBrandsStepDefs.user_clicks_on_See_All_Brands()"
=======
  "name": "user clicks on Manage Addresses",
  "keyword": "Then "
});
formatter.match({
  "location": "addShippingAddressStepDefs.user_clicks_on_Manage_Addresses()"
>>>>>>> 0938d54ba0410e6dcece98388e3608e51c05a899
});
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "user should see all frame brands",
  "keyword": "Then "
});
formatter.match({
  "location": "frameBrandsStepDefs.user_should_see_all_frame_brands()"
=======
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
>>>>>>> 0938d54ba0410e6dcece98388e3608e51c05a899
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});