package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_009Page {
    WebDriver driver;

    By loginPageLocator = By.id("loginForm");
    By errorMessageLocator = By.id("errorMessage");

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void irAPaginaRestringida() {
        driver.get("http://sistemademo.com/area-restringida");
    }

    public void ingresarURLDirecta() {
        driver.get("http://sistemademo.com/modulo-protegido");
    }

    public boolean esPaginaDeLogin() {
        return driver.findElement(loginPageLocator).isDisplayed();
    }

    public boolean seMuestraMensajeDeError() {
        return driver.findElement(errorMessageLocator).isDisplayed();
    }
}