@AddProductFeature

  Feature: Add Product

    Scenario: User ingin menambah product dengan menginputkan valid data
      Given user membuka halaman login
      When user input email 'miia@gmail.com'
      And user input password'Mia123'
      And user klik tombol Masuk
      And user klik button +Jual
      And user input nama produk 'Sweater'
      And user input harga '15000'
      And user klik dropdown kategori
      And user pilih kategori 'Baju'
      And user input deskripsi 'Sweater beruang'
      And user klik foto produk
      And user klik button Terbitkan
      Then product akan tertampil di homepage

      Scenario Outline: User ingin menambah product dengan menginputkan harga barang yang minus
        Given user membuka halaman login
        When user input email 'miia@gmail.com'
        And user input password'Mia123'
        And user klik tombol Masuk
        And user klik button +Jual
        And user input nama produk 'Dress'
        And user input harga '<hargaproduk>'
        And user klik dropdown kategori
        And user pilih kategori 'Baju'
        And user input deskripsi 'Dress hitam putih'
        And user klik foto produk
        And user klik button Terbitkan
        Then user mendapatkan pesan error bahwa harga barang tidak boleh minus
        Examples:
          | hargaproduk |
          | -35000      |

