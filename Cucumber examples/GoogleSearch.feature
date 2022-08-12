Feature: feature to test the search functionality

  Scenario: Validate google search is working
    Given Open the browser
    And user is on google search page
    When user enters a text in search box
    And User clicks on search/hit enter
    Then user is navigated to search results
