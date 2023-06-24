@RegisterFeature
  Feature: Register

      Scenario: User dapat register akun
      Given user membuka halaman register
      When user menginputkan nama 'Mia'
      And user menginputkan email 'miia@gmail.com'
      And user menginputkan password 'Mia123'
      And user klik tombol Daftar
      Then user dapat masuk ke dalam sistem


      Scenario Outline: User register akun dengan invalid data
      Given user membuka halaman register
      When user menginputkan nama '<nama>'
      And user menginputkan email '<email>'
      And user menginputkan password '<password>'
      And user klik tombol Daftar
      Then user mendapat pesan error
      Examples:
        | nama | email | password |
        | Miya | mia@gmail.com | Mia123 |
        | Mia  | miaa@gmail.com | Mia   |
        | Mia  | mia@abab.com   | Mia123|
