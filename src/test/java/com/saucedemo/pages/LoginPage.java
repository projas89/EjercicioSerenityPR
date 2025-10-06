package com.saucedemo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");

    public void openLogin() {
        openUrl("https://www.saucedemo.com/");
    }

    public void loginAs(String user, String pass) {
        $(usernameField).type(user);
        $(passwordField).type(pass);
        $(loginButton).click();
    }
}
