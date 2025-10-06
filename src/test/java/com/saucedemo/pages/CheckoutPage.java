package com.saucedemo.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckoutPage extends PageObject {
    public By firstName = By.id("first-name");
    public By lastName = By.id("last-name");
    public By postalCode = By.id("postal-code");
    public By continueButton = By.id("continue");
    public By finishButton = By.id("finish");

    public void fillCheckout(String f, String l, String postal) {
        $(firstName).type(f);
        $(lastName).type(l);
        $(postalCode).type(postal);
        $(continueButton).click();
    }
    public void finish() {
        $(finishButton).click();
    }
}
