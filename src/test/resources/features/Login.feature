
@Manager
Feature: This is Login page

  @SC01
  Scenario: Login with Invalid credentials
   Given Open url in browser
    When Enter "mngr446532" and "vagytEd" and click on login
    Then   Login should be successful


#  @SC03
#  Scenario: Edit customer form with valid credentials
#    Given Open url application in browser
#    When  Enter CustomerId "" and click on submit button
#    Then  It should be submit

#  @SC04
#  Scenario: Delete customer form with valid credentials
#    Given Open url application in browser
#    When  Enter valid CustomerId "" and click on submit button
#    Then  It should be submit
#

#  @SC05
#  Scenario: Add new account form with valid credentials
#    Given Open url application in browser
#    When  Enter customid ""and choose an account type
#    And   Enter Intialdeposit "" and click on submit button
#    Then  It should be submit
#
#    @SC06
#    Scenario: Edit Account Form with valid credentials
#       Given  Open url application in browser
#       When   Enter AccNo "" click on submit
#       Then   It should be submit

#    @SC07
#    Scenario: Delete account form with valid credentials
#        Given Open url application in browser
#        When  Enter account number and click on submit
#        Then  It should be submit




