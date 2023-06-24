package org.binar.bootcamp.automation.ui.pages;


import net.thucydides.core.pages.PageObject;
import org.springframework.stereotype.Component;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.yecht.Data;

@Component
public class InfoAkunPage extends PageObject {

    @FindBy(xpath = "//a[contains(@class, 'nav-link dropdown-toggle d-flex align-items-center')]")
    private WebElementFacade dropdownNavbar;

    @FindBy(xpath = "//div[contains(@class,'fs-5 fw-bold')]")
    private WebElementFacade btnProf;

    @FindBy(xpath = "//img[contains(@class,'img-thumbnail img-avatar-profile rounded-4 p-0 border-0 overflow-hidden')]")
    private WebElementFacade btnProfile;

    @FindBy(xpath = "//select")
    private WebElementFacade dropdownKota;

    @FindBy(xpath = "//textarea[contains(@placeholder,'Contoh: Jalan Ikan Hiu 33')]")
    private WebElementFacade txtAlamat;

    @FindBy(xpath = "//input[contains(@placeholder,'contoh: +628123456789')]")
    private WebElementFacade txtNoTelp;

    @FindBy(xpath = "//input[contains(@value,'Simpan')]")
    private WebElementFacade btnSimpan;


    public void clickDropDownNavbar()
    {
        dropdownNavbar.click();
    }

    public void clickProfileNama()
    {
        btnProf.click();
    }

    public void FotoProfil()
    {
        btnProfile.click();
    }


    public void clickDropDownKota()
    {
        dropdownKota.click();
    }

    public void selectKota(String kota)
    {
        dropdownKota.selectByVisibleText(kota);
    }

    public void InputTxtAlamat(String alamat)
    {
        txtAlamat.type(alamat);
    }

    public void InputTxtNoTelp(String telp)
    {
        txtNoTelp.type(telp);
    }

    public void clickBtnSimpan()
    {
        btnSimpan.click();
    }




}
