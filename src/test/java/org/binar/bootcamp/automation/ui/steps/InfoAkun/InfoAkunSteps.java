package org.binar.bootcamp.automation.ui.steps.InfoAkun;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.binar.bootcamp.automation.ui.pages.InfoAkunPage;
import org.springframework.beans.factory.annotation.Autowired;

public class InfoAkunSteps extends ScenarioSteps {

    @Autowired
    InfoAkunPage infoAkunPage;


    @Given("^user berada di homepage dalam keadaan telah login$")
    public void userBeradaDiHomepageDalamKeadaanTelahLogin() {
        infoAkunPage.openAt("https://secondhand.binaracademy.org/users/sign_in");
    }

    @And("^user klik dropdown navbar$")
    public void userKlikDropdownNavbar() {
        infoAkunPage.clickDropDownNavbar();

    }

    @And("^user klik Profil Saya$")
    public void userKlikProfilSaya() {
        infoAkunPage.clickProfileNama();
    }

    @And("^user klik foto profil$")
    public void userKlikFotoProfil() {
        infoAkunPage.FotoProfil();
    }


    @And("^user klik dropdown kota$")
    public void userKlikDropdownKota() {
        infoAkunPage.clickDropDownKota();
    }

    @And("^user pilih kota '(.*)'$")
    public void userPilihKota(String kota) {
        infoAkunPage.selectKota(kota);
    }


    @And("^user input alamat '(.*)'$")
    public void userInputAlamat(String alamat) {
        infoAkunPage.InputTxtAlamat(alamat);
    }

    @And("^user input no telp '(.*)'$")
    public void userInputNoTelp(String telp) {
        infoAkunPage.InputTxtNoTelp(telp);
    }

    @Then("^user klik tombol simpan$")
    public void userKlikTombolSimpan() {
        infoAkunPage.clickBtnSimpan();
    }

    @Then("^user dapat notif peringatan nomor telp tidak sesuai$")
    public void userDapatNotifPeringatanNomorTelpTidakSesuai() {
    }

}
