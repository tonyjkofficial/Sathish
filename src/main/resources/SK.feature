Feature:  Ad Hotel

  Background:
    When User launch URL

  @abc
  Scenario Outline:
    When User Enters "<username>"
    When User Enters pass "<password>"
    When User Clicks "<menu>"
    Examples:
      | username   | password     | menu  |
      | PeterSK012 | harry potter | login |