$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/rcb.feature");
formatter.feature({
  "name": "To  verify RCB Team",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "get rcb player list",
  "keyword": "Given "
});
formatter.match({
  "location": "RCBSteps.get_rcb_player_list()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify that team has 4 forign players",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "to verify the forign players count",
  "keyword": "When "
});
formatter.match({
  "location": "RCBSteps.to_verify_the_forign_players_count()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To verify team has maximum four foriegn players",
  "keyword": "Then "
});
formatter.match({
  "location": "RCBSteps.to_verify_team_has_maximum_four_foriegn_players()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "get rcb player list",
  "keyword": "Given "
});
formatter.match({
  "location": "RCBSteps.get_rcb_player_list()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify at least one wicket keeper",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "to verify team has one wicket keeper",
  "rows": [
    {
      "cells": [
        "Bowler"
      ]
    },
    {
      "cells": [
        "Batsman"
      ]
    },
    {
      "cells": [
        "All-Rounder"
      ]
    },
    {
      "cells": [
        "Wicket-keeper"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "RCBSteps.to_verify_team_has_one_wicket_keeper(DataTable)"
});
formatter.result({
  "status": "passed"
});
});