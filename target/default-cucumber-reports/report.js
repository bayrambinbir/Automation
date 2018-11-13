$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/visionworks/features/offers/offersWithSignIn.feature");
formatter.feature({
  "name": "Offers with Sign in",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User is on the website and looking for offers",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@offersWithSignIn"
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
  "name": "User clicks on offers top tab",
  "keyword": "Given "
});
formatter.match({
  "location": "offersWithoutSignInStepDefs.user_clicks_on_offers_top_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees the Page title saying \"Visionworks Offers, Discounts \u0026 Coupons on Glasses | Visionworks\"",
  "keyword": "Then "
});
formatter.match({
  "location": "offersWithoutSignInStepDefs.user_sees_the_Page_title_saying(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters zip code",
  "keyword": "Then "
});
formatter.match({
  "location": "offersWithoutSignInStepDefs.user_enters_zip_code()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Go button for zip code",
  "keyword": "And "
});
formatter.match({
  "location": "offersWithoutSignInStepDefs.user_clicks_on_Go_button_for_zip_code()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees the map with store locations",
  "keyword": "Then "
});
formatter.match({
  "location": "offersWithoutSignInStepDefs.user_sees_the_map_with_store_locations()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees how many stores are there in that area",
  "keyword": "Then "
});
formatter.match({
  "location": "offersWithoutSignInStepDefs.user_sees_how_many_stores_are_there_in_that_area()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});