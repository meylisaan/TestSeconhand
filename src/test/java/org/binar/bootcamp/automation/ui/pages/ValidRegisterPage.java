package org.binar.bootcamp.automation.ui.pages;

import net.thucydides.core.pages.PageObject;
import org.springframework.stereotype.Component;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@Component
public class ValidRegisterPage  extends PageObject {

    @FindBy(xpath = "//input[contains(@placeholder,'Nama Lengkap')]")
    private WebElementFacade txtInputNama;

    @FindBy(xpath = "//input[contains(@placeholder,'Contoh: johndee@gmail.com')]")
    private WebElementFacade txtInputEmail;

    @FindBy(xpath = "//input[contains(@placeholder,'Masukkan password')]")
    private WebElementFacade txtInputPassword;

    @FindBy(xpath = "//input[contains(@value,'Daftar')]")
    private WebElementFacade btnDaftar;

    public void typeInputNama(String name) {
        txtInputNama.type(name);
    }

    public void typeInputEmail(String email) {
        txtInputEmail.type(email);
    }

    public void typeInputPassword(String password) {
        txtInputPassword.type(password);
    }

    public void clickButtonDaftar(){
        btnDaftar.click();
    }
}
