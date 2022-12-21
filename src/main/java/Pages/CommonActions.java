package Pages;

import com.codeborne.selenide.Browser;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.open;

public class CommonActions {
    public void sendEnterKey() {
        actions().sendKeys(Keys.ENTER);
    }

    public void openPage(String URL) {
        open("https://" + URL);
    }
}
