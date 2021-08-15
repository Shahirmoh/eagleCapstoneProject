$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/HomePage.feature");
formatter.feature({
  "line": 3,
  "name": "Home Page",
  "description": "",
  "id": "home-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Homecomplete"
    }
  ]
});
formatter.before({
  "duration": 2507205800,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.match({
  "location": "LaptopsAndNotebookPageDef.user_on_Retail_Website()"
});
formatter.result({
  "duration": 2417513900,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "User verify currency values change",
  "description": "",
  "id": "home-page;user-verify-currency-values-change",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User click on Currency",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User Chose Euro from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "currency value should change to Euro",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.user_click_on_Currency()"
});
formatter.result({
  "duration": 5085746400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.user_chose_Euro_from_dropdown()"
});
formatter.result({
  "duration": 5861761300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.currency_value_should_change_to_Euro()"
});
formatter.result({
  "duration": 5725832500,
  "status": "passed"
});
formatter.after({
  "duration": 709807200,
  "status": "passed"
});
formatter.before({
  "duration": 1476781000,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.match({
  "location": "LaptopsAndNotebookPageDef.user_on_Retail_Website()"
});
formatter.result({
  "duration": 1575666400,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User empty Shopping cart message displays",
  "description": "",
  "id": "home-page;user-empty-shopping-cart-message-displays",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 16,
      "value": "#Given User is on Retail website"
    }
  ],
  "line": 17,
  "name": "User click on shopping cart",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "\u0027Your shopping cart is empty!\u0027 message should display",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.user_click_on_Shopping_Cart()"
});
formatter.result({
  "duration": 5327386700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.your_shopping_cart_is_empty()"
});
formatter.result({
  "duration": 284411800,
  "status": "passed"
});
formatter.after({
  "duration": 726753600,
  "status": "passed"
});
});