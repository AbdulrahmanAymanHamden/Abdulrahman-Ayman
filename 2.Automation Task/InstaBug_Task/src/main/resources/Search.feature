Feature: Search -> User should be able to search for anything he wants

  Scenario: user could search for a word by writing it in search box
    Given user clicked on the search box
    When user enters a text to search for
    And user clicks Enter Key
    Then User should directed to page displays the result of the search

################################### Scenario 2 ########################################################

  Scenario: a drop down menu with suggestions appears when user enters a subText into search box
    Given user clicked on the search box
    When user Enters a subtext into search box
    Then A drop down menu should appears with suggestions related to the subtext

    ################################### Scenario .3 ########################################################

  Scenario: user can select one of the suggestions of the drop down menu
    Given user clicked on the search box
    When user Enters a subtext into search box
    And A drop down menu should appears with suggestions related to the subtext
    And User selects one of the suggestions
    Then User should directed to the coressponding page

    ################################ Scenario .4 ##########################################################
  Scenario: User can search using Google Keyboard
    Given  user clicked on Google Keyboard
    Then Google Keyboard should appear and user can use it in writing

        ################################ Scenario 5 ##########################################################
  Scenario: User can search using Microphone
    Given  user clicked on Microphone icon
    Then User should directed to Microphone page

    #################################### Scenario 6 ###################################################
  Scenario: User can choose to between Arabic an English search
    Given User Clicked on English link to search in English
    Then User should navigate to English Engine of google
    And User Clicked on Arabic link to search in Arabic
    Then User should navigate to Arabic Engine of google
