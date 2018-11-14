$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/visionworks/features/offers/pract.feature");
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
      "name": "@practice"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "when this happens",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "this happens",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "this also happens",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});