package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import pages.CheckoutPage;
import pages.HomePage;
import utils.BrowserName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChallengeOne extends TestBase {

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
        homePage.selectCandyCategory();
        homePage.addProduct4();
        homePage.addProduct5();
        homePage.clickOpenCategories();
        homePage.selectAllCategories();
        homePage.clickBtnCart();

        CheckoutPage checkoutPage = PageFactory.initElements(webDriver, CheckoutPage.class);
        checkoutPage.addProduct4Qty();
        checkoutPage.addProduct4Qty();
        checkoutPage.addProduct4Qty();
        checkoutPage.clickFinishCheckout();
        assertEquals(MESSAGE_SUCCESS, checkoutPage.getMessageSuccess());
        checkoutPage.clickCloseModal();
    }
}
