@DOT
Feature: This is Delete Account Page

  Background:
    Given Open url in browser
    When  Enter "mngr446532" and "vagytEd" and click on login

  @SC05
  Scenario: Delete account with invalid credentials
    When    Enter acc number"9876434" And click on submit
    Then    Delete account successfully







