package my.company;

import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@Title("Passed tests")
@Description("This testsuite has tests what always are passing")
public class TestPassedTests {

    @Title("Test what do nothing and always passed right, but have a very long title, over 100 symbols, seriously")
    @Description("I hate descriptions! See the title!")
    @Test
    public void passedTestWithTitle() {
        assertTrue(true);
    }

    @Test
    public void anotherPassedTest() {
        assertThat("2 * 2 is 2 + 2", 2 * 2, is(2 + 2));
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Test
    public void trivialTest() {
        assertEquals("Testing".charAt(1), 'e');
    }
}
