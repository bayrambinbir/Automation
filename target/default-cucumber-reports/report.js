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
  "name": "user should see favorites",
  "keyword": "Then "
});
formatter.match({
  "location": "viewingFavoritesStepDefs.user_should_see_favorites()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});