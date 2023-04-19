Feature: Harding+ Careers Page
  Scenario: Job Application

    Given that I am looking at the company's homepage
    And searching for an Automated Test Analyst job
    When I click on apply button
    Then  I should be able to fill in the mandatory fields with the Basic data on the first page
    And I should get the <expected result> when submitting the application.

