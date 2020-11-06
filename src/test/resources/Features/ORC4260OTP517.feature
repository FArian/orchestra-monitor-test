@OTE-21
Feature: 

  Background: 
    #@OTP-517
    Given The login page is opening
    When user enters username and password
    And clicks on submit button
    Then user navigated to the orchestra Monitor

  #The new version of the licensing system has improved handling of speed when using ip-licenses. This has to be activate within orchestra
  @OTP-530 @OTP-460 @OTE-22
  Scenario Outline: Use 1.0.0.8 Version of licensing system_CucumberTest_ORC-4260
    Given orchestra already using ip-licenses
    When user click on License Management button
    Then user navigated to License Management page
    And all <content> are <present> available

    Examples: 
      | content              | present                                        |
      | License verification | Network based verification                     |
      | State                | Orchestra license and node activation is valid |
