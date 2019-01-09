Feature: About Testers

  Scenario: Serenity testing
    Given Serenity test case
    When Execute test
    Then Execute successfully

  @manual:passed
  Scenario: cucumber testing
    Given Serenity test case
    When Execute test
    Then Execute successfully
