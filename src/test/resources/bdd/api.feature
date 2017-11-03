Feature: the version can be retrieved
  Scenario: client makes call to GET /version
    When the client calls version endpoint
    Then the client receives status code of 200
    And the version of the API should be v1