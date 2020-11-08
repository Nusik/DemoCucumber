package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DragAndDropPage {

    private SelenideElement debitSideAccount = $x("//*[@id='bank']/li");
    private SelenideElement debitSideAmount = $x("//*[@id='amt7']/li");
    private SelenideElement creditSideAccount = $x("//*[@id='loan']/li");
    private SelenideElement creditSideAmount = $x("//*[@id='amt8']/li");
    private SelenideElement bankItem = $x("//*[@id='credit2']/a");
    private SelenideElement salesItem = $x("//*[@id='credit1']/a");
    private SelenideElement fiveThousand = $x("//*[@id='fourth']/a");
    private SelenideElement perfectMessage = $x("//a[contains(text(),'Perfect')]");

    public SelenideElement getBank() {
        return bankItem;
    }

    public SelenideElement getSales() {
        return salesItem;
    }

    public SelenideElement getFiveThousands() {
        return fiveThousand;
    }

    public void dragBankToDebitAccount() {
        (bankItem).dragAndDropTo(debitSideAccount);
    }

    public void dragSalesToCreditAccount() {
        (salesItem).dragAndDropTo(creditSideAccount);
    }

    public void dragFiveThousandToDebitAmount() {
        (fiveThousand).dragAndDropTo(debitSideAmount);
    }

    public void dragFiveThousandToCreditAmount() {
        (fiveThousand).dragAndDropTo(creditSideAmount);
    }

    public SelenideElement getPerfectMessage() {
        return perfectMessage;
    }

    public boolean isPerfectMessagePresent() {
        return perfectMessage.isDisplayed();
    }
}
