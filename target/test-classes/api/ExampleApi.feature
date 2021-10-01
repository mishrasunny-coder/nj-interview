@api

Business Need: API Validation Test

  Scenario: Validate that i can retrieve a user
    Given I call the api requesting user id 2
    And It returns a 200 status code
    Then It will contain the user object for user id 2
