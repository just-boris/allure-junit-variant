package my.company;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeTrue;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 08.08.13
 */

public class TestWithoutSteps {

    @Test
    public void passedTestWithoutSteps() {
        assertThat(4, is(2 + 2));
    }

    @Test
    public void failedTestWithoutSteps() {
        assertThat("5 is not 2 + 2", 5, is(2 + 2));
    }

    @Test
    public void skippedTestWithoutSteps() {
        assumeTrue("Skipp it", false);
        assertThat(4, is(2 + 2));
    }

    @Test
    public void brokenTestWithoutSteps() {
        assertThat(new Integer[]{}[1], is(2 + 2));
    }
}
