@tag
Feature: Calculator

  Scenario: sqrt of division of two numbers
    Given Two input values, 75 and 3
    When I calculate sqrt of the division of the a by the b
    Then I expect the result 5

  Scenario Outline: sqrt of division of two numbers
    Given Two input values, <first> and <second>
    When I calculate sqrt of the division of the a by the b
    Then I expect the result <result>
    Examples:
      | first | second | result |
      | 4     | 1     | 2     |
      | 36     | 4     | 3     |
      | 0    | 1      | 0      |
      | 0    | 0      | -1      |
      | 75    | 3      | 5      |
      | -25    | -1      | 5      |
      | -162    | -2      | 9      |
