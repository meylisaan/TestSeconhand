@LihatProdukFeature

  Feature: Lihat Produk

    Scenario: User ingin melihat spesifikasi produk yang memiliki gambar secara acak
      Given user membuka halaman login
      When user input email 'miia@gmail.com'
      And user input password'Mia123'
      And user klik tombol Masuk
      And user klik produk untuk Produk
      Then spesifikasi produk akan tertampil

    Scenario Outline: User ingin melihat spesifikasi produk yang tidak memiliki gambar secara acak
      Given user membuka halaman login
      When user input email 'miia@gmail.com'
      And user input password'Mia123'
      And user klik tombol Masuk
      And user klik produk untuk Buku Tulis lagi
      Then spesifikasi produk akan tertampil
      Examples:
        |  |

