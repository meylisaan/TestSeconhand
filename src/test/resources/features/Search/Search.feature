@SearchFeature

  Feature: Search

    Scenario: user ingin memastikan fungsi search dapat digunakan
      Given user membuka halaman login
      When user input email 'miia@gmail.com'
      And user input password'Mia123'
      And user klik tombol Masuk
      And user klik search box
      And user input produk ''