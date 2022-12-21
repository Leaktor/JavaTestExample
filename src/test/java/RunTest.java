import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
        glue = "steps",
        tags = "@test"
)

public class RunTest {
    @BeforeClass
    public static void startApp() {
        WebDriverManager.chromedriver().browserVersion("108").setup();
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    }

    @AfterClass
    public static void afterApp() {
        SelenideLogger.removeListener("allure");
    }
}


