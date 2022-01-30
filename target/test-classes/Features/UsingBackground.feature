Feature: Feature to test Login Functionality

  Background: user is on Login Webpage background
    Given user is on Login Webpage background

  @tag1
  Scenario Outline: Check login is successful with valid credentials with background
    When User enters "<username>" and "<password>"
    And Clicks on login button
    Then User is navigated to the homepage

    Examples: 
      | username | password |
      | Akhil    |    12345 |

  @tag2
  Scenario Outline: Check login is successful with valid credentials with background second script
    When User enters "<username>" and "<password>"
    And Clicks on login button
    Then User is navigated to the homepage

    Examples: 
      | username | password |
      | Akhil    |    12345 |
