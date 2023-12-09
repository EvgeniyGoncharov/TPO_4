Feature: stack calc

  Scenario: sum two numbers
    Given stack calc
    When enter "5+3"
    Then result 8

  Scenario: minus two numbers
    Given stack calc
    When enter "5-3"
    Then result 2

  Scenario: multiply two numbers
    Given stack calc
    When enter "5*2.1"
    Then result 10.5

  Scenario: divide two numbers
    Given stack calc
    When enter "5/3"
    Then result 1.667