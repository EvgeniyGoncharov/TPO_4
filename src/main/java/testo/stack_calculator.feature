Feature: stack calc

  Scenario: sum two numbers
    Given stack calc
    When enter "5+3"
    Then math result is 8

  Scenario: minus two numbers
    Given stack calc
    When enter "5-3"
    Then math result is 2

  Scenario: multiply two numbers
    Given stack calc
    When enter "5*2.1"
    Then math result is 10.5

  Scenario: divide two numbers
    Given stack calc
    When enter "5/3"
    Then math result is 1.667

  Scenario: multiply three numbers
    Given stack calc
    When enter "5+2*3"
    Then math result is 11

  Scenario: divide two numbers
    Given stack calc
    When enter "5/0+2"
    Then arithmetic error
