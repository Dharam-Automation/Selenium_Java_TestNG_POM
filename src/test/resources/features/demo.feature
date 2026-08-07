Feature: Login Functionality

  As a registered user
  I want to log in to the application
  So that I can access my account

  Background:
    Given the user is on the Login page

  Scenario: Successful login with valid credentials
    When the user enters username "testuser"
    And the user enters password "Password123"
    And the user clicks the Login button
    Then the user should be redirected to the Dashboard
    And the welcome message should be displayed

  Scenario: Login with invalid password
    When the user enters username "testuser"
    And the user enters password "WrongPassword"
    And the user clicks the Login button
    Then an error message "Invalid username or password" should be displayed

  Scenario: Login with invalid username
    When the user enters username "wronguser"
    And the user enters password "Password123"
    And the user clicks the Login button
    Then an error message "Invalid username or password" should be displayed

  Scenario: Login with blank username and password
    When the user leaves the username blank
    And the user leaves the password blank
    And the user clicks the Login button
    Then the validation message "Username is required" should be displayed
    And the validation message "Password is required" should be displayed