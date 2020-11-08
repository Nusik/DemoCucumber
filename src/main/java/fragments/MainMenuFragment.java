package fragments;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainMenuFragment extends BaseFragment {

    protected SelenideElement rootElement = $("div.row>nav");

    private SelenideElement seleniumMenu = $x("//a[@class='dropdown-toggle' and contains(text(), 'Selenium')]");
    private SelenideElement dragAndDropLink = $x("//a[contains(text(), 'Drag and Drop Action')]");
    private SelenideElement fileUploadLink = $x("//a[contains(text(), 'File Upload')]");
    private SelenideElement newToursMenu = $x("//a[contains(text(), 'New Tours')]");
    private SelenideElement agileProjectMenu = $x("//a[contains(text(), 'Agile Project')]");
    private SelenideElement tableDemoLink = $x("//a[contains(text(), 'Table Demo')]");

    public MainMenuFragment() {
        super.rootElement = rootElement;
    }

    public SelenideElement getRootElement() {
        return rootElement;
    }

    private void clickSeleniumMenu() {
        seleniumMenu.click();
    }

    public void clickDragAndDropLink() {
        clickSeleniumMenu();
        dragAndDropLink.click();
    }

    public void clickTableDemo() {
        clickSeleniumMenu();
        tableDemoLink.click();
    }

    public void clickFileUploadLink() {
        clickSeleniumMenu();
        fileUploadLink.click();
    }

    public void clickAgileProjectMenu() {
        agileProjectMenu.click();
    }

    public void clickNewToursMenu() {
        newToursMenu.click();
    }
}

