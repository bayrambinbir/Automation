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
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on My Account main tab",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks on Create An Account",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user fills out all the fields",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks on I agree to receive news and offers from Visionworks box",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks on Check this box to show you understand the Terms of Use box",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks on Agree \u0026 Create An Account Box",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});