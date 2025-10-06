package com.saucedemo.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductsPage extends PageObject {
    public By addToCartButtonFor(String productName) {
        // find product card by name and the add button within
        return By.xpath("//div[@class='inventory_item' and .//div[@class='inventory_item_name' and text()='" + productName + "']]//button");
    }
    public By shoppingCart = By.id("shopping_cart_container");
    public boolean isOnProductsPage() {
        return $("span.title").containsText("Products");
    }
    public void addProductToCart(String productName) {
        $(addToCartButtonFor(productName)).click();
    }
    public void openCart() {
        $(shoppingCart).click();
    }
}
