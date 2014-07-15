package my.company;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Boris Serdyuk just-boris@yandex-team.ru
 *         Date: 28.04.14
 */
public class BeforeClassFailTest {

    @BeforeClass
    public static void setUp() throws Exception {
        throw new RuntimeException("bye-bye");
    }

    @Test
    public void testTest() throws Exception {

    }
}
