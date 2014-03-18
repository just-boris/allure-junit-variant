package my.company;

import org.apache.commons.lang3.StringEscapeUtils;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Description;

import static org.json.XML.escape;
import static org.junit.Assert.assertTrue;

public class NonAsciiTest {

    @Test
    @Description("Этот тест проходит")
    public void test_pass() throws Exception {
        assertTrue(true);
    }

    @Test
    @Description("Этот тест выкидывает исключение с русскими буквами")
    public void test_raise_cyrilling() throws Exception {
        throw new Exception(StringEscapeUtils.escapeXml("Невероятная проблема!"));
    }

}
