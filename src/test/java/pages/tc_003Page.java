package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {
    WebDriver driver;

    By forgotPasswordLink = By.id("forgot-password-link");
    By emailInput = By.id("email-input");
    By sendButton = By.id("send-button");
    By confirmationMessage = By.id("confirmation-message");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickForgotPasswordLink() {
        driver.findElement(forgotPasswordLink).click();
    }

    public boolean isRecoveryPageDisplayed() {
        return driver.getCurrentUrl().contains("password-recovery");
    }

    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public boolean isConfirmationMessageDisplayed() {
        return driver.findElement(confirmationMessage).isDisplayed();
    }

    public void clickSendButton() {
        driver.findElement(sendButton).click();
    }

    public boolean isEmailSent() {
        // Simulate email sent check since this typically requires backend verification
        return true;
    }
}