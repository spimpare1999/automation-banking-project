@SD
Feature: This is Delete Customer Page

  Background:
    Given Open url in browser
    When  Enter "mngr446532" and "vagytEd" and click on login

  @SC04
  Scenario: Delete Customer with Invalid Credentials
    When  Enter CustomerId "23576" And click on submit
    Then  Delete Customer successfully



