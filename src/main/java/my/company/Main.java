package my.company;

import ru.yandex.qatools.allure.data.AllureReportGenerator;

import java.io.File;

/**
 * @author Boris Serdyuk just-boris@yandex-team.ru
 *         Date: 12/9/13
 *         use in emergence cases
 */

public class Main {
    public static void main(String[] args) {
        File input = new File("target/site/allure-maven-plugin/data");
        AllureReportGenerator generator = new AllureReportGenerator(input);
        generator.generate(input);
    }
}
