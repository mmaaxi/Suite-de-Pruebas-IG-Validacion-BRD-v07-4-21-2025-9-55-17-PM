package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_009Page;
import static org.junit.Assert.assertTrue;

public class tc_009Steps {
    WebDriver driver = new ChromeDriver();
    tc_009Page page = new tc_009Page(driver);

    @Given("el usuario no ha iniciado sesión")
    public void el_usuario_no_ha_iniciado_sesión() {
        driver.get("http://sistemademo.com/");
        // No realizar ninguna acción de inicio de sesión.
    }

    @When("el usuario intenta acceder a una página restringida")
    public void el_usuario_intenta_acceder_a_una_página_restringida() {
        page.irAPaginaRestringida();
    }

    @Then("el sistema redirige a la página de login")
    public void el_sistema_redirige_a_la_página_de_login() {
        assertTrue(page.esPaginaDeLogin());
    }

    @When("el usuario ingresa la URL directa de un módulo protegido")
    public void el_usuario_ingresa_la_URL_directa_de_un_módulo_protegido() {
        page.ingresarURLDirecta();
    }

    @Then("se muestra un mensaje de error o se redirige a la autenticación")
    public void se_muestra_un_mensaje_de_error_o_se_redirige_a_la_autenticación() {
        assertTrue(page.esPaginaDeLogin() || page.seMuestraMensajeDeError());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}