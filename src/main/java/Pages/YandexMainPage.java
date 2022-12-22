package Pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class YandexMainPage {
    private final SelenideElement searchString = $x("//input[contains(@class,'search3__input')]");
    private final ElementsCollection searchResultCards = $$x("//*[contains(@class, 'serp-item_card')]");

    public void sendKeysInSearchString(String keys) {
        searchString.sendKeys(keys);
    }

    public void clickEnterButton() {
        searchString.sendKeys(Keys.ENTER);
    }

    public void cardInResultGreaterThan(int cardsCount) {
        searchResultCards.shouldBe(CollectionCondition.sizeGreaterThan(cardsCount));
    }

}
