package my.company;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.qatools.allure.annotations.Title;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

@RunWith(Parameterized.class)
public class IterationsTest {

    private int number;

    public IterationsTest(int number) {
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
    public void calculationTest() throws Exception {
        Random random = new Random();
        Thread.sleep(random.nextInt(2000));
        int result = number % 10;
        if(result == 0) {
            assumeTrue("Nothing to do", false);
        }
        else if(result == 1) {
            throw new Exception("Number 1 is not expected");
        }
        else {
            result += 1 - random.nextInt(2);
        }
        assertTrue("My choice is", result < 8);
    }
}
