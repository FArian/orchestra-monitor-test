#Author: farhad.arian@soffico.de
@OrchestraLogin
Feature: feauture to test orchestra login functionality

  @OrchestraSingleUserLoginUser
  Scenario: Check orchestra Monitor login is successful with valid credentials
    Given Orchestra is runing and browser is opened
    And user is on orchestra login page
    When a user enters username and password
    And clicks on submit button
    Then user navigated to the orchestra Monitor page
