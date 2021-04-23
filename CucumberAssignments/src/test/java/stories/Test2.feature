Feature: OrangeHRM Application

  @RegressionTest
  Scenario: Login to the application
    Given I am in OrangeHRP Application
    Then Login to Application
    When Dashboard page is available
    And click on Admin menu

  @SmokeTest
  Scenario: Go to Job page
    Given I am on Admin menu
    Then Click on job
    And Validate the url

  @SmokeTest
  Scenario: Go to leave page
    Given I am on Dashboard
    Then Click on leave
    And Validate the url

  @RegressionTest
  Scenario: Search for LindaAnderson
    Given I have to click on PIM tab
    Then Search for LindaAnderson
    And Validate the result
