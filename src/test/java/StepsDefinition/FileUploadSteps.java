package StepsDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.UploadFilePage;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class FileUploadSteps {

    HomePage homePage = new HomePage();
    UploadFilePage uploadFilePage = new UploadFilePage();

    public FileUploadSteps() throws AWTException {
    }

    @Given("user is on uploadFilePage")
    public void userIsOnUploadFilePage() {
        homePage.navigate();
        homePage.getMainMenuFragment().clickFileUploadLink();
    }

    @And("title of page is {string}")
    public void titleOfPageIs(String title) {
        assertEquals(title, uploadFilePage.getTitle());
    }

    @When("user click {string} button")
    public void userClickButton(String selectFile) {
        uploadFilePage.clickSelectFileButton();
    }

    @And("add file path")
    public void addFilePath() throws Exception {
        uploadFilePage.addFileToUpload();
    }

    @And("click {string} button")
    public void clickButton(String submitBtn) {
        assertEquals(submitBtn, uploadFilePage.getSubmitButton().getText());
        uploadFilePage.clickSubmitButton();
    }
}
