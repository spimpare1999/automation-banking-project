@SK
Feature: This is Log Out Page

  Background:
    Given Open url in browser
    When  Enter "mngr446532" and "vagytEd" and click on login

  @SC11
  Scenario: Log out with valid credentials
    When    Click on log out button
    Then    Log out successfully



