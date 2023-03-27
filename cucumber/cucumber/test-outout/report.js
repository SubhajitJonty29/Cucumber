$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/SUBHAJIT PAUL/eclipse-workspace/cucumber/src/main/java/featurefiles/test.feature");
formatter.feature({
  "line": 1,
  "name": "Test",
  "description": "",
  "id": "test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "test feature",
  "description": "",
  "id": "test;test-feature",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I open browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.i_open_browser()"
});
formatter.result({
  "duration": 16569419100,
  "status": "passed"
});
});