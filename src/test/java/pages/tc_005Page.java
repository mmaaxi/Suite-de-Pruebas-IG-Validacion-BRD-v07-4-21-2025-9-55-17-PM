package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_005Page {

    WebDriver driver;
    
    By loginTextbox = By.id("login");
    By passwordTextbox = By.id("password");
    By submitButton = By.id("submit");
    By logoutButton = By.id("logout");
    By homePage = By.id("home");
    By loginPage = By.id("loginPage");
    
    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }
    
    public void iniciarSesion(String usuario, String contrasenha) {
        driver.findElement(loginTextbox).sendKeys(usuario);
        driver.findElement(passwordTextbox).sendKeys(contrasenha);
        driver.findElement(submitButton).click();
    }
    
    public boolean esInicioCorrecto() {
        return driver.findElement(homePage).isDisplayed();
    }
    
    public void cerrarSesion() {
        driver.findElement(logoutButton).click();
    }
    
    public boolean estaEnPaginaDeInicio() {
        return driver.findElement(homePage).isDisplayed();
    }
    
    public void intentarAccederSinSesion() {
        driver.navigate().to("urlDePaginaInterna");
    }
    
    public boolean estaEnPantallaDeLogin() {
        return driver.findElement(loginPage).isDisplayed();
    }
}