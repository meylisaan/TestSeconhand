package org.binar.bootcamp.automation.ui.steps.ValidRegister;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.binar.bootcamp.automation.ui.pages.ValidRegisterPage;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidRegisterSteps extends ScenarioSteps {

    @Autowired
    ValidRegisterPage validRegisterPage;

    @Given("^user membuka halaman register$")
    public void userMembukaHalamanRegister() {
        validRegisterPage.openAt("https://secondhand.binaracademy.org/users/sign_up");
    }


    @When("^user menginputkan nama '(.*)'$")
    public void userMenginputkanNama(String name) {
        validRegisterPage.typeInputNama(name);
    }

    @And("^user menginputkan email '(.*)'$")
    public void userMenginputkanEmail(String email) {
        validRegisterPage.typeInputEmail(email);
    }

    @And("^user menginputkan password '(.*)'$")
    public void userMenginputkanPassword(String password) {
        validRegisterPage.typeInputPassword(password);
    }

    @And("^user klik tombol Daftar$")
    public void userKlikTombolDaftar() {
        validRegisterPage.clickButtonDaftar();
    }

    @Then("^user dapat masuk ke dalam sistem$")
    public void userDapatMasukKeDalamSistem() {

    }

    @Then("^user mendapat pesan error$")
    public void userMendapatPesanError() {
    }
}
