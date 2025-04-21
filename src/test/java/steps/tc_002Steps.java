package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_002Page;
import utils.DriverFactory;

public class tc_002Steps {

    WebDriver driver = DriverFactory.getDriver();
    tc_002Page loginPage = new tc_002Page(driver);

    @Given("El usuario está en la página de inicio de sesión")
    public void usuario_esta_en_la_pagina_de_inicio_de_sesion() {
        loginPage.navigateToLoginPage();
    }

    @When("El usuario ingresa un nombre de usuario válido y contraseña incorrecta")
    public void usuario_ingresa_credenciales_incorrectas() {
        loginPage.enterUsername("usuarioValido");
        loginPage.enterPassword("contraseñaIncorrecta");
    }

    @When("El usuario hace clic en el botón 'Iniciar sesión'")
    public void usuario_hace_click_en_boton_iniciar_sesion() {
        loginPage.clickLoginButton();
    }

    @Then("El sistema muestra un mensaje de error indicando credenciales inválidas")
    public void sistema_muestra_mensaje_error_credenciales_invalidas() {
        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
    }
}