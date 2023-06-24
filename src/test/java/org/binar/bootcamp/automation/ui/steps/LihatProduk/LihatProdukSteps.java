package org.binar.bootcamp.automation.ui.steps.LihatProduk;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.binar.bootcamp.automation.ui.pages.LihatProdukPage;
import org.springframework.beans.factory.annotation.Autowired;

public class LihatProdukSteps extends ScenarioSteps {

    @Autowired
    LihatProdukPage lihatProdukPage;


    @And("^user klik produk untuk Produk$")
    public void userKlikProdukUntukProduk() {
        lihatProdukPage.clickSpesifikasiProduk();
    }

    @Then("^spesifikasi produk akan tertampil$")
    public void spesifikasiProdukAkanTertampil() {
    }


    @And("^user klik produk untuk Buku Tulis lagi$")
    public void userKlikProdukUntukBukuTulisLagi() {
        lihatProdukPage.clickSpekProdukTanpaGambar();
    }
}
