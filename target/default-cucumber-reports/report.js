$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/visionworks/features/ShippingAddresses/shippingAddresses.feature");
formatter.feature({
  "name": "ShippingAddresses",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add a new shipping address",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@shippingAddress"
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
  "location": "VWaccountSettingsStepDefs.user_signs_in_to_the_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on My Account",
  "keyword": "Then "
});
formatter.match({
  "location": "VWaccountSettingsStepDefs.user_clicks_on_My_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Manage Addresses",
  "keyword": "Then "
});
formatter.match({
  "location": "VWshippingAddressesStepDefs.user_clicks_on_Manage_Addresses()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Add New Address button",
  "keyword": "And "
});
formatter.match({
  "location": "VWshippingAddressesStepDefs.user_clicks_on_Add_New_Address_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills all information as follows: Name \"Bayram\" Last Name \"Binbir\" PhoneFirstThree \"210\" PhoneSecondThree \"234\" PhoneLastFour \"2121\" Address \"175 E Houston St\" City \"San Antonio\" Zip Code \"78205\" State is TX",
  "keyword": "Then "
});
formatter.match({
  "location": "VWshippingAddressesStepDefs.user_fills_all_information_as_follows_Name_Last_Name_PhoneFirstThree_PhoneSecondThree_PhoneLastFour_Address_City_Zip_Code_State_is_TX(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Save button",
  "keyword": "And "
});
formatter.match({
  "location": "VWshippingAddressesStepDefs.user_clicks_on_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies the confirmation saying that \"Your new prescription has been saved.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "VWshippingAddressesStepDefs.user_verifies_the_confirmation_saying_that(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: The result of the xpath expression \"(//*[@id\u003d\u0027main-container\u0027]/div[2]/div/section/p/text())[2]\" is: [object Text]. It should be an element.\n  (Session info: chrome\u003d70.0.3538.77)\n  (Driver info: chromedriver\u003d71.0.3578.33 (269aa0e3f0db08097f0fe231c7e6be200b6939f7),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027LT-SAT00015\u0027, ip: \u0027172.17.90.135\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 71.0.3578.33 (269aa0e3f0db0..., userDataDir: C:\\Users\\bbinbir\\AppData\\Lo...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:61859}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 70.0.3538.77, webStorageEnabled: true}\nSession ID: e45b247d5e76b4d947fc4eecc6b825d2\n*** Element info: {Using\u003dxpath, value\u003d(//*[@id\u003d\u0027main-container\u0027]/div[2]/div/section/p/text())[2]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:419)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.getText(Unknown Source)\r\n\tat com.visionworks.step_definitions.VWshippingAddressesStepDefs.user_verifies_the_confirmation_saying_that(VWshippingAddressesStepDefs.java:60)\r\n\tat ✽.user verifies the confirmation saying that \"Your new prescription has been saved.\"(src/test/resources/com/visionworks/features/ShippingAddresses/shippingAddresses.feature:10)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});