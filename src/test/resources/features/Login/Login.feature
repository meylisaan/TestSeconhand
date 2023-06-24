@LoginFeature
Feature: Login feature


  Scenario: User login dengan valid email dan password
    Given user membuka halaman login
    When user input email 'miia@gmail.com'
    And user input password'Mia123'
    And user klik tombol Masuk
    Then user diarahkan menuju dashboard

  Scenario Outline: : User login dengan invalid data
    Given user membuka halaman login
    When user input email '<email>'
    And user input password'<password>'
    And user klik tombol Masuk
    Then user mendapatkan pesan error
    Examples:
      | email | password|
      |miya@gmail.com | Mia123|
      |miia@gmail.com  | mia123|
      |miya@gmail.com | mia123|






