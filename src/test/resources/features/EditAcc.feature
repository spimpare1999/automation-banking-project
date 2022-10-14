@SF
Feature: This is Edit Account Page

  Background:
    Given Open url in browser
    When  Enter "mngr446532" and "vagytEd" and click on login

  @SC06
  Scenario: Edit account with Invalid credentials
    When    Enter AccountNo "9876543" And click on submit
    Then    Edit account successfully





