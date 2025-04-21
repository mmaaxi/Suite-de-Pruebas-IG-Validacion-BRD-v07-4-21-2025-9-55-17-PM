package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_005Page;

public class tc_005Steps {

    tc_005Page page = new tc_005Page();

    @Given("el usuario ha iniciado sesión con credenciales válidas")
    public void iniciarSesionConCredencialesValidas() {
        page.iniciarSesion("usuarioValido", "contrasenhaValida");
        Assert.assertTrue(page.esInicioCorrecto());
    }

    @When("el usuario hace clic en la opción 'Cerrar sesión'")
    public void cerrarSesion() {
        page.cerrarSesion();
    }

    @Then("el usuario debe ser redirigido a la página de inicio")
    public void redirigidoAPaginaDeInicio() {
        Assert.assertTrue(page.estaEnPaginaDeInicio());
    }

    @When("el usuario intenta acceder a una página interna")
    public void intentarAccederAPaginaInterna() {
        page.intentarAccederSinSesion();
    }

    @Then("el sistema debe redirigir al usuario a la pantalla de login")
    public void redirigidoAPantallaDeLogin() {
        Assert.assertTrue(page.estaEnPantallaDeLogin());
    }
}