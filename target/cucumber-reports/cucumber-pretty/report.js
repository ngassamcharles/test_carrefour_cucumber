$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("home.feature");
formatter.feature({
  "line": 1,
  "name": "Search milk on Carrefour website",
  "description": "      Given I launch the home page\r\n      And I enter milk for search\r\n      And I select the first product\r\n      Then Should get the details of prpduct",
  "id": "search-milk-on-carrefour-website",
  "keyword": "Feature"
});
});