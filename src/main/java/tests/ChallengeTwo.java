package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import pages.CheckoutPage;
import pages.HomePage;
import utils.BrowserName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChallengeTwo extends TestBase {

    private final static String MESSAGE_SUCCESS = "Pedido realizado com sucesso!";

    @AfterEach
    public void quit() {
        webDriver.quit();
    }

    @Test
    public void runChrome() {
        initSetting(BrowserName.CHROME);
        defaultTest();
    }

    @Test
    public void runFirefox() {
        initSetting(BrowserName.FIREFOX);
        defaultTest();
    }

    private void defaultTest() {
        HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
        homePage.clickOpenCategories();
        homePage.selectDrinkCategory();
        homePage.addProduct0();
        homePage.addProduct1();
        homePage.addProduct2();
        homePage.clickOpenCategories();
        homePage.selectAllCategories();
        homePage.addProduct3();
        homePage.clickBtnCart();

        CheckoutPage checkoutPage = PageFactory.initElements(webDriver, CheckoutPage.class);
        for (int i = 1; i < 9; i++)
            checkoutPage.addProduct3Qty();

        for (int i = 1; i < 5; i++)
            checkoutPage.removeProduct3Qty();

        Double expectedQuantity = Double.parseDouble(formatPrice(checkoutPage.getPriceTotal()));
        assertEquals(expectedQuantity, sumQuantity(checkoutPage));

        checkoutPage.clickFinishCheckout();
        assertEquals(MESSAGE_SUCCESS, checkoutPage.getMessageSuccess());
        checkoutPage.clickCloseModal();
    }

    private Double sumQuantity(CheckoutPage checkoutPage) {
        Long qtdProduct0 = Long.parseLong(checkoutPage.getQtdProduct0());
        Double priceProduct0 = Double.parseDouble(formatPrice(checkoutPage.getPriceProduct0()));

        Long qtdProduct1 = Long.parseLong(checkoutPage.getQtdProduct1());
        Double priceProduct1 = Double.parseDouble(formatPrice(checkoutPage.getPriceProduct1()));

        Long qtdProduct2 = Long.parseLong(checkoutPage.getQtdProduct2());
        Double priceProduct2 = Double.parseDouble(formatPrice(checkoutPage.getPriceProduct2()));

        Long qtdProduct3 = Long.parseLong(checkoutPage.getQtdProduct3());
        Double priceProduct3 = Double.parseDouble(formatPrice(checkoutPage.getPriceProduct3()));

        return (qtdProduct0 * priceProduct0) + (qtdProduct1 * priceProduct1) +
                (qtdProduct2 * priceProduct2) + (qtdProduct3 * priceProduct3);
    }

    private String formatPrice(String priceToFormat) {
        return priceToFormat.replace("R$", "")
                .replace(",", ".");
    }
}