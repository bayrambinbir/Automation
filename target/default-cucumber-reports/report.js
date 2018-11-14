$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/visionworks/features/brands/viewingBrand.feature");
formatter.feature({
  "name": "Viewing brands",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User wants to see all glasses for a brand",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@viewingBrand"
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
  "name": "user clicks on Brands top tab",
  "keyword": "Then "
});
formatter.match({
  "location": "viewingBrandStepDefs.user_clicks_on_Brands_top_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects a brand",
  "keyword": "And "
});
formatter.match({
  "location": "viewingBrandStepDefs.user_selects_a_brand()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see all glasses available for chosen brand",
  "keyword": "Then "
});
formatter.match({
  "location": "viewingBrandStepDefs.user_should_see_all_glasses_available_for_chosen_brand()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user chooses newest glasses from the drop down filter",
  "keyword": "Then "
});
formatter.match({
  "location": "viewingBrandStepDefs.user_chooses_newest_glasses_from_the_drop_down_filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees the price and name of first three glasses- from left to right",
  "keyword": "Then "
});
formatter.match({
  "location": "viewingBrandStepDefs.user_sees_the_price_and_name_of_first_three_glasses_from_left_to_right()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});