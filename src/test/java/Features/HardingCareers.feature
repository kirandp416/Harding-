Feature: Harding+ Careers Page

  @P1
  Scenario Outline: Job Application

    Given that I am looking at the company's homepage
    And searching for an Automated Test Analyst job
    When I click on apply button
    Then I should be able to fill in the '<mandatory fields>' with the Basic data and upload '<file>' on the first page
      | Surname | Email          | Phone Number | Town      |
      | Moon    | Moon@yahoo.com | 07122587895  | Newcastle |
    And I should get the '<expected result>' when submitting the application.

    Examples:
      | mandatory fields | file                              | expected result        |
      | Space            | src/main/resources/PDF upload.exe |                        |
      | Jupiter          | src/main/resources/png upload.exe | This field is required |
      | Pluto            | src/main/resources/exeupload.exe  | This field is required |
      |                  | src/main/resources/PDF upload.exe | This field is required |