package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public class tc_001Page {
  WebDriver driver = DriverFactory.getDriver();

  By usernameField = By.id("username");
  By passwordField = By.id("password");
  By loginButton = By.id("loginButton");
  By homePageIdentifier = By.id("homePage");

  public tc_001Page() {
    PageFactory.initElements(driver, this);
  }

  public void openLoginPage() {
    driver.get("https://example.com/login");
  }

  public void enterUsername(String username) {
    WebElement usernameElem = driver.findElement(usernameField);
    usernameElem.clear();
    usernameElem.sendKeys(username);
  }

  public void enterPassword(String password) {
    WebElement passwordElem = driver.findElement(passwordField);
    passwordElem.clear();
    passwordElem.sendKeys(password);
  }

  public void clickLoginButton() {
    driver.findElement(loginButton).click();
  }

  public void verifyHomePageIsDisplayed() {
    boolean isDisplayed = driver.findElement(homePageIdentifier).isDisplayed();
    assert isDisplayed : "Homepage is not displayed";
  }
}