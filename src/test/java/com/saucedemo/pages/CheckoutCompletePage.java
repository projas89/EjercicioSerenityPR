package com.saucedemo.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckoutCompletePage extends PageObject {
    public By completeHeader = By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']");

    public boolean isOrderComplete() {
        return $(completeHeader).isPresent();
    }
}
