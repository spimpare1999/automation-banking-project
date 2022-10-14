@Test
Feature: This is New Customer Validation Page

  Background:
    Given Open url in browser
    When  Enter "mngr446532" and "vagytEd" and click on login

  @SC03
  Scenario: Edit Customer form with Invalid credentials
    When   Enter CustomerId "23576" And click on submit button
   Then    Customer should be edit successfully


