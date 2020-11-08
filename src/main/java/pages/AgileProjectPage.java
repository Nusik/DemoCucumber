package pages;

import com.codeborne.selenide.SelenideElement;
import fragments.AgileProjectMenuFragment;

import static com.codeborne.selenide.Selenide.$;

public class AgileProjectPage {

    AgileProjectMenuFragment agileProjectMenuFragment = new AgileProjectMenuFragment();

    private SelenideElement welcomeMessage = $(".heading3");

    public boolean isWelcomeMessagePresent() {
        return welcomeMessage.isDisplayed();
    }

    public AgileProjectMenuFragment getAgileProjectMenuFragment() {
        return agileProjectMenuFragment;
    }
}
