Feature: Flight Booking Functionality

Scenario: Successful flight booking
    Given User is on the flight booking page
    When User enters flight details
    |Female|
    |Male|
    And User proceeds to payment
    Then User receives a booking confirmation


Scenario Outline: Successful flight booking
    Given User is on the flight booking page
    When User enters flight details
    And User proceeds to payment
    Then User receives a booking confirmation
    
    Example
    |radio|
    |Female|
    |Male|