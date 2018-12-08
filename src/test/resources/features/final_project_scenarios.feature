@final_project
Feature Final Project

  #Below two scenarios are from website https://darksky.net

  @darksky-1
  Scenario: Verify timline is displayed in correct format
    Given I am on Darksky home page
    Then I verify timeline is displayed with two hours incremented

#