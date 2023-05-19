@regression
Feature: Job Search Test
  As user I want to find job



  @sanity @smoke
  Scenario Outline: User should navigate search job page
    Given           I am on home page
    When            I enter job title "<jobTitle>"
    And             I enter location "<location>"
    And             I select distance "<distance>"
    Then            I click on more search options link
    And             I enter minimum salary "<salaryMin>"
    And             I enter maximum salary "<salaryMax>"
    And             I select salary type "<salaryType>"
    And             I select job type "<jobType>"
    And             I click on find job button
   Then             I should navigate search job page "<verify message>"
  Examples:
    |jobTitle              |location              |distance|salaryMin|salaryMax|salaryType|jobType  |verify message                                |
    |Tester                |Harrow, Greater London|5 miles |30000    |60000    |Per annum |Permanent|Permanent Tester jobs in Harrow                |
    |Accountant            |Harrow, Greater London|5 miles |30000    |60000    |Per annum |Permanent|Permanent Accountant jobs in Harrow            |
    |Account Manager       |Wembley, Greater London|7 miles|25000    |50000    |Per month |Permanent|Permanent Account Manager jobs in Wembley      |
    |Software Engineer     |Harrow, Greater London|10 miles|40000    |100000   |Per annum |Permanent|Permanent Software Engineer jobs in Harrow     |
    |Software Test Engineer|Harrow, Greater London|15 miles|50000    |80000    |Per annum |Permanent|Permanent Software Test Engineer jobs in Harrow|
    |Software Engineer     |Harrow, Greater London|10 miles|40000    |100000   |Per annum |Permanent|Permanent Software Engineer jobs in Harrow     |
    |Bank Manager          |Harrow, Greater London|7 miles |40000    |60000    |Per annum |Permanent|Permanent Bank Manager jobs in Harrow          |

