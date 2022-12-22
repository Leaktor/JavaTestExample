package steps;

import Pages.CommonActions;
import Pages.YandexMainPage;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Если;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;

public class YandexStepdefs {
    YandexMainPage yandexMainPage = new YandexMainPage();
    CommonActions commonActions = new CommonActions();


    @Дано("Открыть страницу {string}")
    public void открыть_страницу(String string) {
        commonActions.openPage(string);
    }

    @Если("Ввести {string} в строку поиска")
    public void ввестиВСтрокуПоиска(String query) {
        yandexMainPage.sendKeysInSearchString(query);
    }

    @И("Нажать кнопку Ввод")
    public void нажатьКнопкуВвод() {
        yandexMainPage.clickEnterButton();
    }

    @Тогда("Проверить что количество карточек в выдаче больше {int}")
    public void проверитьЧтоКоличествоКарточекВВыдачеБольше(int cardsCount) {
        yandexMainPage.cardInResultGreaterThan(cardsCount);
    }
}
