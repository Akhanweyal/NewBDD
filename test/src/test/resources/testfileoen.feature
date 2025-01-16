Feature: Flight Booking Functionality

Scenario: Successful flight booking
    Given User is on the flight booking page
    When User enters flight details
        | Female |
        | Male   |
    And User enter years or expiriance
    |5|
    |7|
    Then User receives a booking confirmation

Scenario Outline: Successful flight booking with different data
    Given User is on the flight booking page
    When User enters flight details "<gender>"
    And User enter years or expiriance <years>
    Then User receives a booking confirmation

    Examples:
    | gender |years|
    | Female |2|
    | Male   |5|