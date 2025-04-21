package steps;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_004Page;

public class tc_004Steps {
    tc_004Page loginPage = new tc_004Page();

    @Given("the user navigates to the login page")
    public void navigateToLoginPage() {
        loginPage.goToLoginPage();
    }

    @When("the user tries to log in with invalid credentials three times")
    public void loginWithInvalidCredentialsThreeTimes() {
        for (int i = 0; i < 3; i++) {
            loginPage.enterCredentials("invalidUser", "invalidPass");
            loginPage.clickLoginButton();
        }
    }

    @Then("the user sees an account lockout message")
    public void verifyAccountLockoutMessage() {
        Assert.assertTrue(loginPage.isAccountLockoutMessageDisplayed());
    }

    @Then("the account is temporarily locked")
    public void verifyAccountLocked() {
        Assert.assertTrue(loginPage.isAccountLocked());
    }

    @Then("additional login attempts are blocked until the account is unlocked")
    public void verifyAdditionalLoginAttemptsBlocked() {
        Assert.assertTrue(loginPage.areAdditionalAttemptsBlocked());
    }
}