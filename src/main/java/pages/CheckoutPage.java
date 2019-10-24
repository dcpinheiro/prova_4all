package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage {

    @FindBy(id = "add-product-3-qtd")
    public WebElement addProduct3Qtd;

    @FindBy(id = "add-product-4-qtd")
    public WebElement addProduct4Qtd;

    @FindBy(id = "remove-product-3-qtd")
    public WebElement removeProduct3Qtd;

    @FindBy(css = "h2[class='sc-dNLxif jyncPa']")
    public WebElement messageBuySuccess;

    @FindBy(id = "product-0-price")
    private WebElement priceProduct0;

    @FindBy(id = "product-1-price")
    private WebElement priceProduct1;

    @FindBy(id = "product-2-price")
    private WebElement priceProduct2;

    @FindBy(id = "product-3-price")
    private WebElement priceProduct3;

    @FindBy(id = "product-0-qtd")
    private WebElement qtdProduct0;

    @FindBy(id = "product-1-qtd")
    private WebElement qtdProduct1;

    @FindBy(id = "product-2-qtd")
    private WebElement qtdProduct2;

    @FindBy(id = "product-3-qtd")
    private WebElement qtdProduct3;

    @FindBy(id = "price-total-checkout")
    private WebElement priceTotal;

    @FindBy(id = "finish-checkout-button")
    public WebElement btnFinishCheckout;

    @FindBy(css = "button[class='close-modal sc-jqCOkK ippulb']")
    public WebElement btnCloseModal;

    public void addProduct3Qty() {
        addProduct3Qtd.click();
    }

    public void addProduct4Qty() {
        addProduct4Qtd.click();
    }

    public void removeProduct3Qty() {
        removeProduct3Qtd.click();
    }

    public String getMessageSuccess() {
        return messageBuySuccess.getText();
    }

    public String getPriceProduct0() {
        return priceProduct0.getText();
    }

    public String getPriceProduct1() {
        return priceProduct1.getText();
    }

    public String getPriceProduct2() {
        return priceProduct2.getText();
    }

    public String getPriceProduct3() {
        return priceProduct3.getText();
    }

    public String getPriceTotal() {
        return priceTotal.getText();
    }

    public String getQtdProduct0() {
        return qtdProduct0.getText();
    }

    public String getQtdProduct1() {
        return qtdProduct1.getText();
    }

    public String getQtdProduct2() {
        return qtdProduct2.getText();
    }

    public String getQtdProduct3() {
        return qtdProduct3.getText();
    }

    public void clickFinishCheckout() {
        btnFinishCheckout.click();
    }

    public void clickCloseModal() {
        btnCloseModal.click();
    }
}
