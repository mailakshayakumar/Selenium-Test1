$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature_Files/shopping.feature");
formatter.feature({
  "name": "Shopping on a website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Browse the items available on the website",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the correct web address",
  "keyword": "Given "
});
formatter.match({
  "location": "Step_Definition.the_correct_web_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the \u0027Menu\u0027 page",
  "keyword": "When "
});
formatter.match({
  "location": "Step_Definition.i_navigate_to_the_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can browse a list of the available products.",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.i_can_browse_a_list_of_the_available_products()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Scroll down to select item",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I navigate down",
  "keyword": "When "
});
formatter.match({
  "location": "Step_Definition.i_navigate_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Item",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.i_select_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add to cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I select quantity",
  "keyword": "When "
});
formatter.match({
  "location": "Step_Definition.i_select_quantity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select size",
  "keyword": "And "
});
formatter.match({
  "location": "Step_Definition.i_select_size()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add to bag",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.add_to_bag()"
});
formatter.result({
  "status": "passed"
});
});