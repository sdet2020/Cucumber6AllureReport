Feature: reqres.in
  Scenario: user should be able to get a specific user
    Given user sent a get request for /api/users/2
    Then user should get response body for user 2