package steps;

import pages.tc_001Page;
import io.cucumber.java.en.*;

public class tc_001Steps {
  tc_001Page loginPage = new tc_001Page();

  @Given("el usuario está en la página de inicio de sesión")
  public void el_usuario_está_en_la_página_de_inicio_de_sesión() {
    loginPage.openLoginPage();
  }

  @When("el usuario ingresa nombre de usuario {string} en el campo de usuario")
  public void el_usuario_ingresa_nombre_de_usuario_en_el_campo_de_usuario(String username) {
    loginPage.enterUsername(username);
  }

  @And("el usuario ingresa contraseña {string} en el campo correspondiente")
  public void el_usuario_ingresa_contraseña_en_el_campo_correspondiente(String password) {
    loginPage.enterPassword(password);
  }

  @And("el usuario hace clic en el botón 'Iniciar sesión'")
  public void el_usuario_hace_clic_en_el_botón_iniciar_sesión() {
    loginPage.clickLoginButton();
  }

  @Then("el usuario es redirigido a la página principal")
  public void el_usuario_es_redirigido_a_la_página_principal() {
    loginPage.verifyHomePageIsDisplayed();
  }
}