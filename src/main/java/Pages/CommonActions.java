package Pages;


import static com.codeborne.selenide.Selenide.open;

public class CommonActions {

    public void openPage(String URL) {
        open("https://" + URL);
    }
}
