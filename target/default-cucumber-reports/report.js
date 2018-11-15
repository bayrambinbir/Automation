$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/visionworks/features/brands/allBrandsFrames.feature");
formatter.feature({
  "name": "Viewing all brands of frames",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User wants to see all brands of frames available",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@frameBrands"
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
  "name": "user clicks on See All Brands",
  "keyword": "And "
});
formatter.match({
  "location": "frameBrandsStepDefs.user_clicks_on_See_All_Brands()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see all frame brands",
  "keyword": "Then "
});
formatter.match({
  "location": "frameBrandsStepDefs.user_should_see_all_frame_brands()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});