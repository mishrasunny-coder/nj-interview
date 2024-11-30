@ui

Business Need: UI Validation Test

#     Please automate the following scenario through the browser in the given framework

  @task-1 @test
  Scenario: Patron can log in and out of sportsbook
    Given I am on the Sportsbook
    When I enter incorrect credentials
    Then there is an error informing me about incorrect credentials
