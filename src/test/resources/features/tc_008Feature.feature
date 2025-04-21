Feature: Usability Validation
  In order to ensure system usability
  As an end user
  I want to navigate through main screens and perform basic interactions

  Scenario: Validate system usability
    Given I navigate to the system's home page
    When I browse all the main screens
    Then the interfaces should be intuitive and elements clearly displayed

    When I perform user interactions like clicks, scrolls, and data entries
    Then the system should respond coherently without visual errors