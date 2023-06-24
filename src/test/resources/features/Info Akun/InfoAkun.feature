@InfoAkunFeature

  Feature: Info Akun

    Scenario: User melengkapi informasi akun dengan menggunakan data yang valid
      Given user berada di homepage dalam keadaan telah login
      When user input email 'miia@gmail.com'
      And user input password'Mia123'
      And user klik tombol Masuk
      And user klik dropdown navbar
      And user klik Profil Saya
      And user klik foto profil
      And user klik dropdown kota
      And user pilih kota 'Jogja'
      And user input alamat 'Jalan gagak no 35'
      And user input no telp '081345678995'
      Then user klik tombol simpan

      Scenario Outline:User melengkapi akun dengan menggunakan invalid data
        Given user membuka halaman login
        When user input email 'miia@gmail.com'
        And user input password'Mia123'
        And user klik tombol Masuk
        And user klik dropdown navbar
        And user klik Profil Saya
        And user input no telp '<telp>'
        And user klik tombol simpan
        Then user dapat notif peringatan nomor telp tidak sesuai
        Examples:
          | telp |
          | aabbcdfghn|

