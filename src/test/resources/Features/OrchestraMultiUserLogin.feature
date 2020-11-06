#Author: farhad.arian@soffico.de
@OrchestraLogin
Feature: feauture to test orchestra login functionality with Parameterization

  @OrchestraMultiUserLogin
  Scenario Outline: Check orchestra Monitor login is successful with valid credentials
    Given browser is opened agian
    And user is on orchestra login page agian
    When user enters <username> and <password>
    And clicks on submit button for login
    Then a user navigated to the orchestra Monitor page

    Examples: 
      | username | password |
      | farian   | farian   |
      | monitor  | monitor  |
