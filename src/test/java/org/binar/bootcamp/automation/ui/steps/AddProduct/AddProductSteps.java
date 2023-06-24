package org.binar.bootcamp.automation.ui.steps.AddProduct;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.binar.bootcamp.automation.ui.pages.AddProductPage;
import org.springframework.beans.factory.annotation.Autowired;

public class AddProductSteps extends ScenarioSteps {

    @Autowired
    AddProductPage addProductPage;


    @And("^user klik button \\+Jual$")
    public void userKlikButtonJual() {
        addProductPage.clickButtonJual();
    }

    @And("^user input nama produk '(.*)'$")
    public void userInputNamaProduk(String namaproduk) {
        addProductPage.InputNamaProduk(namaproduk);
    }

    @And("^user input harga '(.*)'$")
    public void userInputHarga(String hargaproduk) {
        addProductPage.InputHargaProduk(hargaproduk);
    }

    @And("^user klik dropdown kategori$")
    public void userKlikDropdownKategori() {
        addProductPage.clickKategoriProduk();
    }

    @And("^user pilih kategori '(.*)'$")
    public void userPilihKategori(String kategoriproduk) {
        addProductPage.pilihKategoriProduk(kategoriproduk);
    }

    @And("^user input deskripsi '(.*)'$")
    public void userInputDeskripsi(String deskripsiproduk) {
        addProductPage.InputDeskripsiProduk(deskripsiproduk);
    }

    @And("^user klik foto produk$")
    public void userKlikFotoProduk() {
        addProductPage.clickButtonGambarProduk();
    }

    @And("^user klik button Terbitkan$")
    public void userKlikButtonTerbitkan() {
        addProductPage.clickButtonTerbitkan();
    }

    @Then("^product akan tertampil di homepage$")
    public void productAkanTertampilDiHomepage() {
    }

    @Then("^user mendapatkan pesan error bahwa harga barang tidak boleh minus$")
    public void userMendapatkanPesanErrorBahwaHargaBarangTidakBolehMinus() {

    }
}
