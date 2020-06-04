@F1
Feature: To validate Amazon Login Page

  Background: 
    Given User enter Amazon page

  @A
  Scenario: To verify user can login with valid credentials in Amazon
    When User Enter Amazon valid Username and valid Password and click login button
    Then Verify User logged into Amazon account

  @B
  Scenario: To verify user can login with invalid credentials in Amazon
    When User Enter Amazon invalid Username and invalid Password and click login button
    Then Verify User logged into Amazon invalid Credentials page

  @C
  Scenario: To verify user can login with valid username and invalid password in Amazon
    When User Enter Amazon valid Username and invalid Password and click login button
    Then Verify User logged into Amazon invalid Credentials page
