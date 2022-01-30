Feature: Feature to test Login Functionality

  @tag1
  Scenario Outline: Check login is successful with valid credentials
    Given User is on Login Webpage
    And User is on Login Webpage
    When User enters "<username>" and "<password>"
    And Clicks on login button
    Then User is navigated to the homepage
    
    Examples: 
    	| username  | password |
    	| Akhil  		| 12345 	 |
    #	| ABCD  		| 12345 	 |

