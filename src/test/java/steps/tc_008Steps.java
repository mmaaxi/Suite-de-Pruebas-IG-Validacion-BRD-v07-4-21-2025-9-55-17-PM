package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_008Page;

public class tc_008Steps {

    WebDriver driver;
    tc_008Page page;

    public tc_008Steps() {
        this.driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc_008Page.class);
    }

    @Given("I navigate to the system's home page")
    public void iNavigateToTheSystemSHomePage() {
        page.openHomePage();
    }

    @When("I browse all the main screens")
    public void iBrowseAllTheMainScreens() {
        page.navigateThroughMainScreens();
    }

    @Then("the interfaces should be intuitive and elements clearly displayed")
    public void theInterfacesShouldBeIntuitiveAndElementsClearlyDisplayed() {
        page.verifyInterfacesIntuition();
    }

    @When("I perform user interactions like clicks, scrolls, and data entries")
    public void iPerformUserInteractions() {
        page.performUserInteractions();
    }

    @Then("the system should respond coherently without visual errors")
    public void theSystemShouldRespondCoherentlyWithoutVisualErrors() {
        page.verifySystemResponse();
    }
}