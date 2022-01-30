@MustRun
Feature: Feature to Google Search

  @tag1
  Scenario: Validate Google Search is working
    Given Browser is open
    And User is on google search page
    And User Accepts Cookies if shown
    When User enters a text in search box
    And User hits enter
    Then User is navigated to search results
    
    Examples: 
    	| username  | password |
    	| name  		| value 	 |

