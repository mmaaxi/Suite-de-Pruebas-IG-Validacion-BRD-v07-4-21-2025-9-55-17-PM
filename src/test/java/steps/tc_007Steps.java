package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.tc_007Page;

public class tc_007Steps {
    
    private WebDriver driver;
    private tc_007Page page;

    @Given("multiple users are accessing the application concurrently")
    public void multipleUsersAccessingApplication() {
        page = new tc_007Page(driver);
        page.simulateConcurrentUserAccess();
    }

    @When("they perform operations in different modules simultaneously")
    public void performOperationsSimultaneously() {
        page.performSimultaneousOperations();
    }

    @Then("the system should maintain acceptable performance without significant slowdown")
    public void systemMaintainsPerformance() {
        page.verifySystemPerformance();
    }

    @Then("the operations should be processed without excessive delays")
    public void operationsProcessedWithoutDelays() {
        page.verifyOperationProcessing();
    }
}