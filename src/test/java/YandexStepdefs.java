import Pages.CommonActions;
import Pages.YandexMainPage;
import io.cucumber.java.ru.Дано;

public class YandexStepdefs {
    YandexMainPage yandexMainPage = new YandexMainPage();
    CommonActions commonActions = new CommonActions();


    @Дано("Открыть страницу {string}")
    public void открыть_страницу(String string) {
        commonActions.openPage(string);
    }
}
