Feature: Search -> User should be able to search for anything he wants

  Scenario: user could search for a word by writing it in search box

    Given user clicked on the search box
    When user enters a text to search for
    And user clicks Enter Key
#    Then User should directed to page displays the result of the search