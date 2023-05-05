Feature: feature to test login functionality
  Scenario: Check title is displayed homepage
    Given user is on duckduckgo page "https://duckduckgo.com/"
    When user enter homepage
    Then user saw title is displayed
