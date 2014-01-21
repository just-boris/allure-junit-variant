package my.company;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.qatools.allure.Allure;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.events.AddParameterEvent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

@RunWith(Parameterized.class)
public class ParametrizedTest {

    private int number;

    public ParametrizedTest(int number) {
        this.number = number;
    }

    @Parameterized.Parameters()
    public static Collection<Object[]> data() {
        List<Object[]> list = new ArrayList<>();

        for (int i = 0; i < 300; i++) {
            list.add(new Object[]{i});
        }

        return list;
    }

    @Test
    @Features(Behaviors.SimpleStories.title)
    @Stories(Behaviors.SimpleStories.PARAMETRIZED_STORY)
    public void calculationTest() throws Exception {
        Allure.LIFECYCLE.fire(new AddParameterEvent("Argument", Integer.toString(number)));
        Random random = new Random();
        Thread.sleep(random.nextInt(2000));
        int result = number % 10;
        if(result == 0) {
            assumeTrue("Nothing to do", false);
        }
        else if(result == 1) {
            throw new Exception("Unexpected value");
        }
        else {
            result += 1 - random.nextInt(2);
        }
        assertTrue(String.format("Expected %d less than 8 ", result), result < 8);
    }
}
