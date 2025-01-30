Feature: Flight Booking Functionality

Scenario: Successful flight booking
    Given User is on the flight booking page
    When User enters flight details
        | Female |
        | Male   |
    And User enter years or expiriance
    |5|
    |7|
    And User enter date of the booking.
    And User select profission type
    |Manual tester|
    |Automation tester|


Scenario Outline: Successful flight booking with different data
    Given User is on the flight booking page
    When User enters flight details "<gender>"
    And User enter years or expiriance <years>
    Then User enter date of the booking.
    And User select profission type


    Examples:
    | gender |years|profission-type|
    | Female |2|manual tester|
    | Male   |5|Automation tester|