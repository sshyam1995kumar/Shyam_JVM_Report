@F @F1
Feature: To validate FB Login Page

  Background: 
    Given User enter FB page

  @A 
  Scenario: To verify user can login with valid credentials in FB
    When User Enter FB valid Username and valid Password and click login button
    Then User logged into FB account

  @B
  Scenario: To verify user can login with invalid credentials in FB
    When User Enter FB invalid Username and invalid Password and click login button
    Then User logged into FB invalid credentials page

  @C
  Scenario: To verify user can login with valid username and invalid password in FB
    When User Enter FB valid Username and invalid Password and click login button
    Then User logged into FB invalid credentials page
