package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import pages.tc_010Page;

import static org.junit.Assert.assertTrue;

public class tc_010Steps {

    WebDriver driver;
    tc_010Page page;

    @Before
    public void setup(){
      // Setup WebDriver paths if necessary
    }

    @Given("estoy usando el navegador {string}")
    public void estoy_usando_el_navegador(String navegador) {
        switch (navegador) {
            case "Chrome":
                driver = new ChromeDriver();
                break;
            case "Firefox":
                driver = new FirefoxDriver();
                break;
            case "Edge":
                driver = new EdgeDriver();
                break;
            case "Safari":
                driver = new SafariDriver();
                break;
            default:
                throw new IllegalArgumentException("Navegador no soportado: " + navegador);
        }
        page = new tc_010Page(driver);
    }

    @When("accedo al sistema")
    public void accedo_al_sistema() {
        page.navegarAlSistema();
    }

    @Then("el sistema se visualiza correctamente y todas las funcionalidades operan de manera uniforme")
    public void el_sistema_se_visualiza_correctamente_y_todas_las_funcionalidades_operan_de_manera_uniforme() {
        assertTrue(page.verificarVistaCorrecta());
    }

    @When("interactúo con los componentes del sistema")
    public void interactuo_con_los_componentes_del_sistema() {
        page.interactuarConComponentes();
    }

    @Then("no se presentan errores o fallos de funcionalidad")
    public void no_se_presentan_errores_o_fallos_de_funcionalidad() {
        assertTrue(page.sistemaSinErrores());
    }
}