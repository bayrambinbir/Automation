$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/visionworks/features/myFavorites/viewingFavorites.feature");
formatter.feature({
  "name": "Viewing Favorites",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Favorites",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@viewingFavorites"
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
  "name": "user clicks on My Account main tab",
  "keyword": "Given "
});
formatter.match({
  "location": "createAnAccountStepDefs.user_clicks_on_My_Account_main_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on My Favorites",
  "keyword": "Then "
});
formatter.match({
  "location": "viewingFavoritesStepDefs.user_clicks_on_My_Favorites()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see how many favorites that he or she has",
  "keyword": "Then "
});
formatter.match({
  "location": "viewingFavoritesStepDefs.user_should_see_how_many_favorites_that_he_or_she_has()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees the name, original price and reduced priced of the favorite item(s)",
  "keyword": "Then "
});
formatter.match({
  "location": "viewingFavoritesStepDefs.user_sees_the_name_original_price_and_reduced_priced_of_the_favorite_item_s()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});