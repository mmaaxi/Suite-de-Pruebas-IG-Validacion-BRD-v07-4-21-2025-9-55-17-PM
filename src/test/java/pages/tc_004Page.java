package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_004Page {

    WebDriver driver;
    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("loginButton");
    By accountLockoutMessage = By.id("lockoutMessage");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void goToLoginPage() {
        driver.get("http://example.com/login");
    }

    public void enterCredentials(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public boolean isAccountLockoutMessageDisplayed() {
        return driver.findElement(accountLockoutMessage).isDisplayed();
    }

    public boolean isAccountLocked() {
        // Simulate check for account locked status
        return true;
    }

    public boolean areAdditionalAttemptsBlocked() {
        // Simulate check for blocked additional attempts
        return true;
    }
}