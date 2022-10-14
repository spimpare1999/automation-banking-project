@MN
Feature: This is mini statement Page

  Background:
    Given Open url in browser
    When  Enter "mngr446532" and "vagytEd" and click on login

  @SC06
  Scenario: Mini statement with invalid credentials
    When   Enter account number "9878446" And click on submit
    Then   Mini statement submit successfully






