Feature: User needs to be able to search on Google
  Scenario: When user searches stars, Google title should change accordingly
    Given user is on the google home page
    When user searches stars in the search field
    Then the title should change to 'stars - Google Search'