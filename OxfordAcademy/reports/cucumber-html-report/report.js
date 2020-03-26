$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/OxfordAcademy.Feature");
formatter.feature({
  "line": 2,
  "name": "Oxford Academy Website",
  "description": "",
  "id": "oxford-academy-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Oxford_Academy_feature"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Registering into Oxford Academy",
  "description": "",
  "id": "oxford-academy-website;registering-into-oxford-academy",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tc01_Oxford_Academy_Register"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Launch the Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "open the Oxford Academy website",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "register using \"\u003cemailId\u003e\" and \"\u003cpassword\u003e\" and \"\u003cconfrimPasswod\u003e\" with vaild and invaild deatils",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "oxford-academy-website;registering-into-oxford-academy;",
  "rows": [
    {
      "cells": [
        "emailId",
        "password",
        "confrimPasswod"
      ],
      "line": 13,
      "id": "oxford-academy-website;registering-into-oxford-academy;;1"
    },
    {
      "cells": [
        "gowtham19980303@gmail.com",
        "Gowtham@98",
        "Gowtham@98"
      ],
      "line": 14,
      "id": "oxford-academy-website;registering-into-oxford-academy;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Registering into Oxford Academy",
  "description": "",
  "id": "oxford-academy-website;registering-into-oxford-academy;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Oxford_Academy_feature"
    },
    {
      "line": 4,
      "name": "@tc01_Oxford_Academy_Register"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Launch the Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "open the Oxford Academy website",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "register using \"gowtham19980303@gmail.com\" and \"Gowtham@98\" and \"Gowtham@98\" with vaild and invaild deatils",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.launch_the_Chrome_browser()"
});
formatter.result({
  "duration": 21482805600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.open_the_Oxford_Academy_website()"
});
formatter.result({
  "duration": 19336899000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gowtham19980303@gmail.com",
      "offset": 16
    },
    {
      "val": "Gowtham@98",
      "offset": 48
    },
    {
      "val": "Gowtham@98",
      "offset": 65
    }
  ],
  "location": "RegisterSteps.register_using_and_and_with_vaild_and_invaild_deatils(String,String,String)"
});
formatter.result({
  "duration": 10401298700,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.close_the_browser()"
});
formatter.result({
  "duration": 19000,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Logging into Oxford Academy",
  "description": "",
  "id": "oxford-academy-website;logging-into-oxford-academy",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@tc02_Oxford_Academy_login"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "the user launch chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "the user opens website",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "The user login using valid and invalid details",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_user_launch_chrome()"
});
formatter.result({
  "duration": 14100219700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.the_user_opens_website()"
});
formatter.result({
  "duration": 9940851500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.the_user_login_using_valid_and_invalid_details()"
});
formatter.result({
  "duration": 277948063000,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "User editing the profile",
  "description": "",
  "id": "oxford-academy-website;user-editing-the-profile",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@tc3_Oxford_Academy_Edit_profile"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "I launch the chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "I open the website and logs-in",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I open the edit personal details page",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I edit and personal details and updates",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "I closes the browser",
  "keyword": "And "
});
formatter.match({
  "location": "EditProfileSteps.i_launch_the_chrome()"
});
formatter.result({
  "duration": 11973669600,
  "status": "passed"
});
formatter.match({
  "location": "EditProfileSteps.i_open_the_website_and_logs_in()"
});
formatter.result({
  "duration": 15342882200,
  "status": "passed"
});
formatter.match({
  "location": "EditProfileSteps.i_open_the_edit_personal_details_page()"
});
formatter.result({
  "duration": 4080326500,
  "status": "passed"
});
formatter.match({
  "location": "EditProfileSteps.i_edit_and_personal_details_and_updates()"
});
formatter.result({
  "duration": 6551428100,
  "status": "passed"
});
formatter.match({
  "location": "EditProfileSteps.i_closes_the_browser()"
});
formatter.result({
  "duration": 136882300,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "User deletes the saved search",
  "description": "",
  "id": "oxford-academy-website;user-deletes-the-saved-search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@tc04_Oxford_Academy_Delete_saved_search"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "The user should launch the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "user should open the website and logs in",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "user should open the saved search",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "user should delete the saved search",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "user should close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "DeleteSavedSearchSteps.the_user_should_launch_the_chrome_browser()"
});
formatter.result({
  "duration": 12534267900,
  "status": "passed"
});
formatter.match({
  "location": "DeleteSavedSearchSteps.user_should_open_the_website_and_logs_in()"
});
formatter.result({
  "duration": 20364095800,
  "status": "passed"
});
formatter.match({
  "location": "DeleteSavedSearchSteps.user_should_open_the_saved_search()"
});
formatter.result({
  "duration": 2950746900,
  "status": "passed"
});
formatter.match({
  "location": "DeleteSavedSearchSteps.user_should_delete_the_saved_search()"
});
formatter.result({
  "duration": 1729114300,
  "status": "passed"
});
formatter.match({
  "location": "DeleteSavedSearchSteps.user_should_close_the_browser()"
});
formatter.result({
  "duration": 105343600,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "User checks if the search is saved",
  "description": "",
  "id": "oxford-academy-website;user-checks-if-the-search-is-saved",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 42,
      "name": "@tc05_Oxford_Academy_count_subscription"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "launching the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "opening the webpage and logs in",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "user counts the subscription and prints",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "user closes the webpage",
  "keyword": "And "
});
formatter.match({
  "location": "CountSubscriptionSteps.launching_the_browser()"
});
formatter.result({
  "duration": 12320301400,
  "status": "passed"
});
formatter.match({
  "location": "CountSubscriptionSteps.opening_the_webpage_and_logs_in()"
});
formatter.result({
  "duration": 15570092900,
  "status": "passed"
});
formatter.match({
  "location": "CountSubscriptionSteps.user_searches_a_journal_and_saves()"
});
formatter.result({
  "duration": 14817309400,
  "status": "passed"
});
formatter.match({
  "location": "CountSubscriptionSteps.user_closes_the_webpage()"
});
formatter.result({
  "duration": 118780800,
  "status": "passed"
});
});