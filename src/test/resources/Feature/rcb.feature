Feature: To  verify RCB Team

  Background: 
    Given get rcb player list

  Scenario: To verify that team has 4 forign players
    When to verify the forign players count
    Then To verify team has maximum four foriegn players

  Scenario: To verify at least one wicket keeper
    Then to verify team has one wicket keeper
      | Bowler        |
      | Batsman       |
      | All-Rounder   |
      | Wicket-keeper |
