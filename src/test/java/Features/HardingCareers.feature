Feature: Harding+ Careers Page

  @P1
  Scenario Outline: Job Application

    Given that I am looking at the company's homepage
    And searching for an Automated Test Analyst job
    When I click on apply button
    Then I should be able to fill in the '<mandatory fields>' with the Basic data and upload '<file>' on the first page
      | Surname | Email                | Phone Number | Town |
      | Sun   | mars@yahoo.com | 07123127895  | Glasgow |
    And I should get the '<expected result>' when submitting the application.

    Examples:
      | mandatory fields | file                                                             | expected result        |
      | Earth            | C:\Automation\Harding+\Harding\src\main\resources\PDF upload.exe |                        |
      | Venus              | C:\Automation\Harding+\Harding\src\main\resources\png upload.exe | This field is required |
      | Neptune            | C:\Automation\Harding+\Harding\src\main\resources\exeupload.exe  | This field is required |
      |                  | C:\Automation\Harding+\Harding\src\main\resources\PDF upload.exe | This field is required |