package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.TC_006Page;
import utils.WebDriverManager;

public class TC_006Steps {

    WebDriver driver = WebDriverManager.getDriver();
    TC_006Page page = new TC_006Page(driver);

    @Given("el usuario esta en la pagina de inicio de sesión")
    public void elUsuarioEstaEnLaPaginaDeInicioDeSesion() {
        driver.get("https://example.com/login");
    }

    @When("el usuario inicia sesión con credenciales válidas")
    public void elUsuarioIniciaSesionConCredencialesValidas() {
        page.login("usuario", "contraseña");
    }

    @Then("el usuario debe ingresar correctamente al sistema")
    public void elUsuarioDebeIngresarCorrectamenteAlSistema() {
        Assert.assertTrue(page.isHomePageDisplayed());
    }

    @When("el usuario navega al módulo {string}")
    public void elUsuarioNavegaAlModulo(String modulo) {
        page.navigateToModule(modulo);
    }

    @Then("el módulo {string} debe cargar correctamente")
    public void elModuloDebeCargarCorrectamente(String modulo) {
        Assert.assertTrue(page.isModulePageDisplayed(modulo));
    }
}