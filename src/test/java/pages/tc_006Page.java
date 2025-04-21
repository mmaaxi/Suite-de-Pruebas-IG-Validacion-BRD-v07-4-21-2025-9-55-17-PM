package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_006Page {

    private WebDriver driver;

    public TC_006Page(WebDriver driver) {
        this.driver = driver;
    }

    private By usernameInput = By.id("username");
    private By passwordInput = By.id("password");
    private By loginButton = By.id("loginButton");
    private By homePageIndicator = By.id("homePage");
    
    private By getModuleLink(String moduleName) {
        return By.linkText(moduleName);
    }
    
    public void login(String username, String password) {
        driver.findElement(usernameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
    }
    
    public boolean isHomePageDisplayed() {
        return driver.findElement(homePageIndicator).isDisplayed();
    }
    
    public void navigateToModule(String moduleName) {
        driver.findElement(getModuleLink(moduleName)).click();
    }
    
    public boolean isModulePageDisplayed(String moduleName) {
        return driver.getTitle().contains(moduleName);
    }
}