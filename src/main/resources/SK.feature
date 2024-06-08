Feature:  Ad Hotel

  Background:
    When User launch URL

  @login @abc
  Scenario Outline: Hotel
    When User Enters "<username>"
    When User Enters pass "<password>"
    When User Clicks "<menu>"
    When User Selects "<option>"
    Examples:
      | username   | password     | menu  | option |
      | PeterSK012 | harry potter | login | hotel  |