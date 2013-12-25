package my.company;

import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeTrue;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 08.08.13
 */

public class SimpleTest {

    @Title("Test what do nothing and always passed right, but have a very long title, over 100 symbols, seriously")
    @Description("I hate descriptions! See the title!")
    @Features(Behaviors.SimpleStories.title)
    @Stories(Behaviors.SimpleStories.SUCCESS_STORY)
    @Test
    public void longTitleTest() {
        assertThat(4, is(2 + 2));
    }

    @Test
    public void failedSimpleTest() {
        assertThat("5 is not 2 + 2", 5, is(2 + 2));
    }

    @Test
    public void skippedSimpleTest() {
        assumeTrue("Skipp it", false);
        assertThat(4, is(2 + 2));
    }

    @Test
    public void brokenSimpleTest() {
        assertThat(new Integer[]{}[1], is(2 + 2));
    }
}
