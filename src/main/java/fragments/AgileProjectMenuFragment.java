package fragments;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AgileProjectMenuFragment {

    private SelenideElement inputUser = $("input[name=uid]");
    private SelenideElement inputPassword = $("input[name=password]");
    private SelenideElement loginButton = $("input[name=btnLogin]");

    public void enterCredentials(String userID, String password) {
        inputUser.val(userID).click();
        inputPassword.val(password).click();
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
