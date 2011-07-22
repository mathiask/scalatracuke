Feature: Start Page
  In order to start using the application 
  As a user
  I want to see the start page

  Scenario: Show start page
    Given a running server
    When I go to "/start"
    Then I should see "Hello Cucumber"
