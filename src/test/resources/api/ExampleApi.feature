@api

Business Need: API Validation Test

  Scenario: Developer can retrieve sporting events for the next 24 hours from the API
    Given I retrieve all events from the API
    When the events are filtered for the next 24 hours
    Then all the remaining events are from the next 24 hours
