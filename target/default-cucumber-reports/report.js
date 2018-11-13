$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/visionworks/features/offers/offersWithoutSignIn.feature");
formatter.feature({
  "name": "Testing offers",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User testing offers",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@offersWitoutSignIn"
    }
  ]
});
formatter.before({
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
formatter.after({
  "status": "passed"
});
});