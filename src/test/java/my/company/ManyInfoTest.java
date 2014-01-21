package my.company;

import my.company.steps.CommonSteps;
import org.junit.Test;
import ru.yandex.qatools.allure.Allure;
import ru.yandex.qatools.allure.annotations.*;
import ru.yandex.qatools.allure.events.AddParameterEvent;
import ru.yandex.qatools.allure.model.SeverityLevel;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * User: eroshenkoam
 * Date: 8/30/13, 6:29 PM
 */
@Description("Testsuite has testcases with many steps\n    and\nmany lines in description")
public class ManyInfoTest {

    public CommonSteps commonSteps = new CommonSteps();

    @Severity(SeverityLevel.CRITICAL)
    @Description("Single-line description")
    @Features(Behaviors.Screenshot.title)
    @Stories(Behaviors.Screenshot.OTHER_SCREENSHOT)
    @Test
    public void attachmentsTest() throws Exception {
        commonSteps.saveJsonFile();
        commonSteps.saveXmlFile();
        commonSteps.saveJpgFile();
        commonSteps.makeThisTestFailed();
    }

    @Severity(SeverityLevel.BLOCKER)
    @Description("I have many steps \n\n    Parent Step \n    Last \n    MakeThisTestBroken")
    @Test
    public void lotOfStepsTest() throws Exception {
        commonSteps.parentStep();
        commonSteps.step("Last");
        commonSteps.makeThisTestBroken();
    }

    @Severity(SeverityLevel.NORMAL)
    @Title("Test with long assertion text")
    @Test
    public void longAssertionTest() throws IOException {
        Allure.LIFECYCLE.fire(new AddParameterEvent("PATH", System.getenv("PATH")));
        Allure.LIFECYCLE.fire(new AddParameterEvent("BASEDIR", new File(".").getCanonicalPath()));
        Allure.LIFECYCLE.fire(new AddParameterEvent("OS", System.getProperty("os.name")));
        Allure.LIFECYCLE.fire(new AddParameterEvent("OS", System.getProperty("os.version")));
        Allure.LIFECYCLE.fire(new AddParameterEvent("OS", System.getProperty("java.version")));
        assertThat("{\n\"name\": \"test\",\n\"value\": \"bad value\"\n}",
                equalTo("{\n\"name\": \"test\",\n\"value\": \"ok value\"\n}"));
    }

}
