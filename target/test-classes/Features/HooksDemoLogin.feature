Feature: Feature to test Login Functionality

  @tag1
  Scenario Outline: Check login is successful with valid credentials
  # Given Browser is open
    And User is on Login Webpage Hooks
    When User enters "<username>" and "<password>" Hooks
    And Clicks on login button Hooks
    Then User is navigated to the homepage Hooks
    
    Examples: 
    	| username  | password |
    	| Akhil  		| 12345 	 |
    #	| ABCD  		| 12345 	 |

