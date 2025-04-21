package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pages.tc_003Page;

public class tc_003Steps {
    WebDriver driver = new ChromeDriver();
    tc_003Page recoveryPage = new tc_003Page(driver);

    @Given("que estoy en la página de inicio de sesión")
    public void estoyEnLaPaginaInicioSesion() {
        driver.get("http://www.ejemplo.com/login");
    }

    @When("hago clic en el enlace 'Olvidé mi contraseña'")
    public void clicOlvideMiContrasena() {
        recoveryPage.clickForgotPasswordLink();
    }

    @Then("el sistema redirige a la página de recuperación de contraseña")
    public void redirigeAPaginaRecuperacionContrasena() {
        Assert.assertTrue(recoveryPage.isRecoveryPageDisplayed());
    }

    @When("ingreso un correo electrónico registrado {string}")
    public void ingresoCorreoRegistrado(String email) {
        recoveryPage.enterEmail(email);
    }

    @Then("el sistema acepta el correo y muestra un mensaje de confirmación")
    public void sistemaAceptaCorreoYConfirma() {
        Assert.assertTrue(recoveryPage.isConfirmationMessageDisplayed());
    }

    @When("hago clic en el botón 'Enviar'")
    public void clicBotonEnviar() {
        recoveryPage.clickSendButton();
    }

    @Then("el sistema envía un email de recuperación")
    public void sistemaEnviaEmailRecuperacion() {
        Assert.assertTrue(recoveryPage.isEmailSent());
        driver.quit();
    }
}