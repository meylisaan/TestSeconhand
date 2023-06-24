package org.binar.bootcamp.automation.ui.pages;

import net.thucydides.core.pages.PageObject;
import org.springframework.stereotype.Component;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@Component
public class AddProductPage extends PageObject {

    @FindBy(xpath = "//a[contains(@class, 'btn btn-primary btn-lg rounded-4 d-inline-flex align-items-center justify-content-space-between px-5')]")
    private WebElementFacade btnJual;

    @FindBy(xpath = "//input[contains(@placeholder, 'Nama Produk')]")
    private WebElementFacade txtInputNamaProduk;

    @FindBy(xpath = "//input[contains(@placeholder, 'Rp 0,00')]")
    private WebElementFacade txtInputHargaProduk;

    @FindBy(xpath = "//select")
    private WebElementFacade dropdownKategoriProduk;

    @FindBy(xpath = "//textarea[contains(@placeholder, 'Contoh: Jalan Ikan Hiu 33')]")
    private WebElementFacade txtInputDeskripsiProduk;

    @FindBy(xpath = "//div[contains(@class, 'form-image rounded-4 img-preview')]")
    private WebElementFacade btnGambarProduk;

    @FindBy(xpath = "//label[contains(@class,'btn btn-primary w-50 rounded-4 p-3')]")
    private WebElementFacade btnTerbitkan;

    public void clickButtonJual()
    {
        btnJual.click();
    }

    public void InputNamaProduk(String namaproduk)
    {
        txtInputNamaProduk.type(namaproduk);
    }

    public void InputHargaProduk(String hargaproduk)
    {
        txtInputHargaProduk.type(hargaproduk);
    }

    public void clickKategoriProduk()
    {
        dropdownKategoriProduk.click();
    }

    public void pilihKategoriProduk(String kategoriproduk)
    {
        dropdownKategoriProduk.selectByVisibleText(kategoriproduk);
    }

    public void InputDeskripsiProduk(String deskripsiproduk)
    {
        txtInputDeskripsiProduk.type(deskripsiproduk);
    }

    public void clickButtonGambarProduk()
    {
        btnGambarProduk.click();
    }

    public void clickButtonTerbitkan()
    {
        btnTerbitkan.click();
    }

}
