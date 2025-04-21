Feature: Validate login attempt limits

  Scenario: Account lockout after three invalid login attempts
    Given the user navigates to the login page
    When the user tries to log in with invalid credentials three times
    Then the user sees an account lockout message
    And the account is temporarily locked
    And additional login attempts are blocked until the account is unlocked