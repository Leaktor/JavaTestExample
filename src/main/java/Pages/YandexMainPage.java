package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class YandexMainPage {
    private static final SelenideElement searchString = $x("//input[contains(@class,'search3__input')]");
    private static final SelenideElement searchResultCard = $x("//*[contains(@class, 'serp-item_card')]");

    public void sendKeysInSearchString(String keys){
        searchString.sendKeys(keys);
    }

}
