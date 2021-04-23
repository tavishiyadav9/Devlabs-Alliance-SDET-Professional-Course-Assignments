Feature: OrangeHRM Application

  Background: I am logged into Orange Application
    Given I click on Admin Link
    Then Click on Job
    And validate text Job Title

  Scenario: Login to the application
    Given I am in OrangeHRP Application
    Then Login to Application
    When Dashboard page is available
    And click on Admin menu