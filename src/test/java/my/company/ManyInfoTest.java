package my.company;

import my.company.steps.CommonSteps;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Story;
import ru.yandex.qatools.allure.model.SeverityLevel;

/**
 * User: eroshenkoam
 * Date: 8/30/13, 6:29 PM
 */
@Description("Testsuite has testcases with many steps\n    and\nmany lines in description")
public class ManyInfoTest {

    public CommonSteps commonSteps = new CommonSteps();

    @Severity(SeverityLevel.CRITICAL)
    @Description("Single-line description")
    @Story(Behaviors.Screenshot.OtherScreenshot.class)
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

}
