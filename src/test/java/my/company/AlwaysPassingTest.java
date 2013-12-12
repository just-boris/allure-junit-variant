package my.company;

import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Story;

import static org.junit.Assert.assertTrue;

/**
 * @author Boris Serdyuk just-boris@yandex-team.ru
 *         Date: 12/12/13
 */
public class AlwaysPassingTest {

    @Test
    @Story(Behaviors.SimpleStories.SuccessStory.class)
    public void testOne() throws Exception {
        assertTrue(true);
    }

    @Test
    @Story(Behaviors.SimpleStories.SuccessStory.class)
    public void testTwo() throws Exception {
        assertTrue(true);
    }

    @Test
    @Story(Behaviors.SimpleStories.SuccessStory.class)
    public void testThree() throws Exception {
        assertTrue(true);
    }

    @Test
    @Story(Behaviors.SimpleStories.SuccessStory.class)
    public void testFour() throws Exception {
        assertTrue(true);
    }

}
