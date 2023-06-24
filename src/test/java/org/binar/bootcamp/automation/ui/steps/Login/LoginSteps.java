package org.binar.bootcamp.automation.ui.steps.Login;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.binar.bootcamp.automation.ui.pages.LoginPages;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginSteps extends ScenarioSteps {

    @Autowired
    LoginPages loginPages;


    @Given("^user membuka halaman login$")
    public void userMembukaHalamanLogin() {
        loginPages.openAt("https://secondhand.binaracademy.org/users/sign_in");
    }


    @When("^user input email '(.*)'$")
    public void userInputEmail(String email) {
        loginPages.txtInputEmail(email);
    }


    @And("^user input password'(.*)'$")
    public void userInputPassword(String password) {
        loginPages.txtInputPassword(password);
    }


    @And("^user klik tombol Masuk$")
    public void userKlikTombolMasuk() {
        loginPages.clickButtonMasuk();
    }


    @Then("^user diarahkan menuju dashboard$")
    public void userDiarahkanMenujuDashboard() {
    }

    @Then("^user mendapatkan pesan error$")
    public void userMendapatkanPesanError() {
    }
}
