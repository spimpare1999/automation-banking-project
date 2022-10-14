@CS
Feature: This is customized statement Page

  Background:
    Given Open url in browser
    When  Enter "mngr446532" and "vagytEd" and click on login

  @SC09
  Scenario: Customize statement with invalid credentials
    When  Enter account no "88765545" And fill date From "21/10/99" To "21/12/20"
    And   Enter mini transaction value "7765" And no of transaction And click on submit
    Then  Customize statement successfully






