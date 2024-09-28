Feature:  SRIKVSTECH

  Background:
    When User launch URL

  @Title @TC01
  Scenario Outline: Verify Page Title
    When User Enter Main Page
    Then Validate "<title>" on Main Page

    Examples:
      | title        |
      | SRI KVS TECH |

  @Headers @TC02
  Scenario Outline: Verify Main Page Headers
    When User Enter Main Page
    Then Validate "<Headers>" on Main Page

    Examples:
      | Headers          |
      | Main Page Fields |