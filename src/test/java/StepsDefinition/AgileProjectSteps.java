package StepsDefinition;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AgileProjectPage;
import pages.HomePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AgileProjectSteps {

    HomePage homePage = new HomePage();
    AgileProjectPage agileProjectPage = new AgileProjectPage();

    @Given("user is on home page")
    public void userIsOnHomePage() {
        homePage.navigate();
    }

    @When("user navigates to agile page")
    public void userNavigatesToAgilePage() {
    homePage.getMainMenuFragment().clickAgileProjectMenu();
    }

    @And("user enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String userId, String password) {
        agileProjectPage.getAgileProjectMenuFragment().enterCredentials(userId, password);
    }

    @And("click login button")
    public void clickLoginButton() {
        agileProjectPage.getAgileProjectMenuFragment().clickLoginButton();
    }

    @Then("welcome message is correct")
    public void welcomeMessageIsCorrect() {
        assertTrue(agileProjectPage.isWelcomeMessagePresent());
    }

    @Then("invalid credentials message is shown")
    public void invalidCredentialsMessageIsShown() {
        assertEquals("User or Password is not valid", Selenide.switchTo().alert().getText());
        Selenide.switchTo().alert().accept();
    }
}
