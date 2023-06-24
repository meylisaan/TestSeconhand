package org.binar.bootcamp.automation.ui.pages;


import net.thucydides.core.pages.PageObject;
import org.springframework.stereotype.Component;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@Component
public class LihatProdukPage extends PageObject {


    @FindBy(xpath = "//a[contains(@href,'/products/7562')]")
    private WebElementFacade btnSpekProduk;


    @FindBy(xpath = "//a[contains(@href,'/products/7027')]")
    private WebElementFacade btnProdukTnpGambar;


    public void clickSpesifikasiProduk()
    {
        btnSpekProduk.click();
    }

    public void clickSpekProdukTanpaGambar()
    {
        btnProdukTnpGambar.click();
    }
}
