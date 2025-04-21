Feature: Validate performance under moderate load

  Scenario: Multiple users access the system and perform operations simultaneously
    Given multiple users are accessing the application concurrently
    When they perform operations in different modules simultaneously
    Then the system should maintain acceptable performance without significant slowdown
    And the operations should be processed without excessive delays