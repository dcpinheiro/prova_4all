package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(id = "open-categories-btn")
    public WebElement btnOpenCategories;

    @FindBy(id = "category-all")
    public WebElement allCategories;

    @FindBy(id = "category-0")
    public WebElement drinkCategory;

    @FindBy(id = "category-1")
    public WebElement candyCategory;

    @FindBy(id = "cart-btn")
    public WebElement btnCart;

    @FindBy(id = "add-product-0-btn")
    public WebElement btnProduct0;

    @FindBy(id = "add-product-1-btn")
    public WebElement btnProduct1;

    @FindBy(id = "add-product-2-btn")
    public WebElement btnProduct2;

    @FindBy(id = "add-product-3-btn")
    public WebElement btnProduct3;

    @FindBy(id = "add-product-4-btn")
    public WebElement btnProduct4;

    @FindBy(id = "add-product-5-btn")
    public WebElement btnProduct5;

    public void clickOpenCategories() {
        btnOpenCategories.click();
    }

    public void selectCandyCategory() {
        candyCategory.click();
    }

    public void selectDrinkCategory() {
        drinkCategory.click();
    }

    public void selectAllCategories() {
        allCategories.click();
    }

    public void addProduct0() {
        btnProduct0.click();
    }

    public void addProduct1() {
        btnProduct1.click();
    }

    public void addProduct2() {
        btnProduct2.click();
    }

    public void addProduct3() {
        btnProduct3.click();
    }

    public void addProduct4() {
        btnProduct4.click();
    }

    public void addProduct5() {
        btnProduct5.click();
    }

    public void clickBtnCart() {
        btnCart.click();
    }
}
