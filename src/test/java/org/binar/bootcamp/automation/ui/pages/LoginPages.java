package org.binar.bootcamp.automation.ui.pages;

import net.thucydides.core.pages.PageObject;
import org.springframework.stereotype.Component;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;


@Component
public class LoginPages extends PageObject{


    @FindBy(xpath = "//input[contains(@placeholder,'Contoh: johndee@gmail.com')]")
    private WebElementFacade InputEmail;

    @FindBy(xpath = "//input[contains(@placeholder,'Masukkan password')]")
    private WebElementFacade InputPassword;

    @FindBy(xpath = "//input[contains(@value,'Masuk')]")
    private WebElementFacade btnMasuk;

    public void txtInputEmail(String email) {
        InputEmail.type(email);
    }

    public void txtInputPassword(String password) {
        InputPassword.type(password);
    }

    public void clickButtonMasuk(){
        btnMasuk.click();
    }

}
