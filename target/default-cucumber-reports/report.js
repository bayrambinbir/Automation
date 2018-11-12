$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/visionworks/features/accountSettings/createAnAccount.feature");
formatter.feature({
  "name": "Create An Account",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User create an account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@createAnAccount"
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
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on I agree to receive news and offers from Visionworks box",
  "keyword": "Then "
});
formatter.match({
  "location": "createAnAccountStepDefs.user_clicks_on_I_agree_to_receive_news_and_offers_from_Visionworks_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
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
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});