package com.saucedemo.tests;

import com.saucedemo.pages.*;
import net.serenitybdd.junit5.SerenityTest;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SerenityTest
public class SauceDemoE2ETest {

    @Managed
    WebDriver driver;

    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();
    CartPage cartPage = new CartPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    CheckoutCompletePage completePage = new CheckoutCompletePage();

    @Test
    public void completePurchaseFlow() {
        // Open and login
        loginPage.openLogin();
        loginPage.loginAs("standard_user", "secret_sauce");

        // Add two products to cart
        productsPage.addProductToCart("Sauce Labs Backpack");
        productsPage.addProductToCart("Sauce Labs Bike Light");

        // Open cart and checkout
        productsPage.openCart();
        cartPage.clickCheckout();

        // Fill checkout info and continue
        checkoutPage.fillCheckout("Juan", "Perez", "010101");
        checkoutPage.finish();

        // Assert completion
        assertTrue(completePage.isOrderComplete(), "Order completion message should be visible");
    }
}
