package my.company.steps;

import org.openqa.selenium.*;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static ru.yandex.qatools.matchers.webdriver.TextMatcher.text;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 28.10.13
 */
public class WebDriverSteps {

    public WebDriver driver;

    public WebDriverSteps(WebDriver driver) {
        this.driver = driver;
    }

    @Step
    public void openMainPage() {
        driver.get("http://ya.ru");
    }

    @Step
    public void search(String text) throws InterruptedException {
        driver.findElement(By.id("text")).sendKeys(text);
        driver.findElement(By.className("b-form-button__input")).submit();
        Thread.sleep(2000);
    }

    @Step
    public WebElement findElement(String selector) {
        return driver.findElement(By.cssSelector(selector));
    }

    @Attachment("Page Screenshot")
    public byte[] makeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @Step("Check text in element")
    public void checkText(WebElement element, String expected) {
        assertThat("Text on current page should be correct", element, text(is(expected)));
    }

    public void quit() {
        driver.quit();
    }
}
