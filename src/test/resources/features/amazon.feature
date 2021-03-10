Feature: User needs to be able to search on Amazon
  Scenario: When user searches books, Amazon title should change accordingly
    Given user is on the amazon home page
    When user enters a book name in the search field
    Then Amazon's title should change to 'Amazon.com : books'