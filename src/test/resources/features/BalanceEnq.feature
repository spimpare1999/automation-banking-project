@SH
Feature: This is Balance Enquiry Page

  Background:
    Given Open url in browser
    When  Enter "mngr446532" and "vagytEd" and click on login

  @SC08
  Scenario: Balance enquiry with invalid credentials
    When  Enter account no "9887655" And click on submit
    Then  Balance enquiry succesfully







