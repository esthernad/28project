@tag
Feature: Amazon Test
  

  @tag1
  Scenario: checking login page
    Given I'm on the home page
    When I click on signin page
    And enter email address
    And click submit
    And enter password and click singin
    Then page loads successfully
    
  