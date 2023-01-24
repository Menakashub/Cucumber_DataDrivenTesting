Feature: Test Login functionality

  Scenario Outline: Check login is successfull with Valid Credentials
    Given Browser is open
    And user is on Login Page
    When user enters <username> and <password>
    And Clicks on Login
    Then user is navigated to home page

    Examples: 
      | username | password |
      | Mnk      |    12345 |
      | Prith    |    12345 |
