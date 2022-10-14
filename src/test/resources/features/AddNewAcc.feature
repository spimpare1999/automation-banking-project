@SE
Feature: This is New Account Page

  Background:
    Given Open url in browser
    When  Enter "mngr446532" and "vagytEd" and click on login

  @SC05
  Scenario: Add new account with invalid credentials
    When    Enter CustomrId "23576" And select Account type
    And     Add Initial deposit "65478" And click on submit button
    Then    Add new Account successfully




