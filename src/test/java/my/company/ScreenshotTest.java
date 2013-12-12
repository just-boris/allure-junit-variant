package my.company;

import my.company.steps.BackendSteps;
import my.company.steps.WebDriverSteps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Story;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;

@Title("Search tests")
@Description("This testsuite has tests what always are passing")
public class ScreenshotTest {

    private WebDriverSteps steps;
    private BackendSteps server;

    @Before
    public void getWebDriver() {
        steps = new WebDriverSteps(new PhantomJSDriver(new DesiredCapabilities()));
        server= new BackendSteps();
        steps.openMainPage();
    }

    @Test
    @Title("Page loading test")
    @Story(Behaviors.Screenshot.WebdriverScreenshot.class)
    public void pageLoadingTest() {
        server.getLog();
        server.getResponse();
        steps.makeScreenshot();
        steps.checkText(steps.findElement("title"), "Yandex");
    }

    @Test
    @Title("Usual search test")
    @Story(Behaviors.Screenshot.WebdriverScreenshot.class)
    public void usualSearch() throws InterruptedException {
        steps.search("yandex qatools");
        steps.makeScreenshot();
    }

    @Test
    @Title("Wildcard search test")
    @Story(Behaviors.Screenshot.WebdriverScreenshot.class)
    public void wildcardSearch() throws InterruptedException {
        steps.search("qatools -yandex");
        steps.makeScreenshot();
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Test
    @Title("Empty text search")
    @Story(Behaviors.Screenshot.WebdriverScreenshot.class)
    public void emptyTextSearch() throws InterruptedException {
        steps.search("");
        steps.makeScreenshot();
    }

    @After
    public void quitWebDriver() {
        steps.quit();
    }
}
