<<<<<<< HEAD
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/visionworks/features/accountSettings/createAnAccount.feature");
formatter.feature({
  "name": "Create An Account",
=======
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/visionworks/features/myFavorites/viewingFavorites.feature");
formatter.feature({
  "name": "Viewing Favorites",
>>>>>>> b690df98b1d0029658cf0a25b046211304967ef5
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
<<<<<<< HEAD
  "name": "User create an account",
=======
  "name": "Favorites",
>>>>>>> b690df98b1d0029658cf0a25b046211304967ef5
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
<<<<<<< HEAD
      "name": "@createAnAccount"
=======
      "name": "@viewingFavorites"
>>>>>>> b690df98b1d0029658cf0a25b046211304967ef5
    }
  ]
});
formatter.before({
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
<<<<<<< HEAD
  "name": "user clicks on Create An Account",
  "keyword": "Then "
});
formatter.match({
  "location": "createAnAccountStepDefs.user_clicks_on_Create_An_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills out all the fields",
  "keyword": "Then "
});
formatter.match({
  "location": "createAnAccountStepDefs.user_fills_out_all_the_fields()"
=======
  "name": "user clicks on My Account main tab",
  "keyword": "Given "
});
formatter.match({
  "location": "createAnAccountStepDefs.user_clicks_on_My_Account_main_tab()"
>>>>>>> b690df98b1d0029658cf0a25b046211304967ef5
});
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "user clicks on I agree to receive news and offers from Visionworks box",
  "keyword": "Then "
});
formatter.match({
  "location": "createAnAccountStepDefs.user_clicks_on_I_agree_to_receive_news_and_offers_from_Visionworks_box()"
=======
  "name": "user clicks on My Favorites",
  "keyword": "Then "
});
formatter.match({
  "location": "viewingFavoritesStepDefs.user_clicks_on_My_Favorites()"
>>>>>>> b690df98b1d0029658cf0a25b046211304967ef5
});
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "user clicks on Check this box to show you understand the Terms of Use box",
  "keyword": "Then "
});
formatter.match({
  "location": "createAnAccountStepDefs.user_clicks_on_Check_this_box_to_show_you_understand_the_Terms_of_Use_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Agree \u0026 Create An Account Box",
  "keyword": "Then "
});
formatter.match({
  "location": "createAnAccountStepDefs.user_clicks_on_Agree_Create_An_Account_Box()"
=======
  "name": "user should see favorites",
  "keyword": "Then "
});
formatter.match({
  "location": "viewingFavoritesStepDefs.user_should_see_favorites()"
>>>>>>> b690df98b1d0029658cf0a25b046211304967ef5
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});