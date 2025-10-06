package com.saucedemo.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CartPage extends PageObject {
    public By checkoutButton = By.id("checkout");
    public void clickCheckout() {
        $(checkoutButton).click();
    }
}
