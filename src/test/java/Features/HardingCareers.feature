Feature: Harding+ Careers Page

  @P2
  Scenario: Job Application

    Given that I am looking at the company's homepage
    And searching for an Automated Test Analyst job
    When I click on apply button
    Then  I should be able to fill in the mandatory fields with the Basic data on the first page
      | First Name | Surname | Email     | Phone Number | Town    |
      | Agnes      | Nemeth  | aa@aa.com | 07777711111  | Bristol |
    And I should get the <expected result> when submitting the application.


  @P1
  Scenario Outline: Job Application Outline

    Given that I am looking at the company's homepage
    And searching for an Automated Test Analyst job
    When I click on apply button
    Then I should be able to fill in the '<mandatory fields>' with the Basic data and upload '<file>' on the first page
      | Surname | Email           | Phone Number | Town   |
      | sgffdsg | dfgfdg@hers.com | 07923375523  | dfgdfg |
    And I should get the '<expected result>' when submitting the application.

    Examples:
      | mandatory fields | file                                                             | expected result        |
      | vcxdbxvc         | C:\Automation\Harding+\Harding\src\main\resources\PDF upload.exe |                        |
      | xvxcv            | C:\Automation\Harding+\Harding\src\main\resources\png upload.exe | This field is required |
      | xbssd            | C:\Automation\Harding+\Harding\src\main\resources\exeupload.exe  | This field is required |
      |                  | C:\Automation\Harding+\Harding\src\main\resources\PDF upload.exe | This field is required |