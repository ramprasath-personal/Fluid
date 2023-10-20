Feature: Fluid automation

  Scenario Outline: Fluid Login page
    Given user land on home page without login
    When user Enter The "<Valid User Name>"
    When User Enter The "<Valid Password>"
    When User Verify The "<Value>"
    Then user Click The Login button

    Examples: 
      | Valid User Name      | Valid Password  | Value          |
      | ramos@pytsandbox.com | corptravelisfun | Login to Fluid! |

  Scenario Outline: Flight Search Page
    When user Enter The "<From>" and "<To>"
    When user Select The departureDate
    Then user Click The Search button

    Examples: 
      | From    | To     |
      | Chennai | Mumbai |
