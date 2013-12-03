package my.company.steps;

import ru.yandex.qatools.allure.annotations.Attach;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.model.AttachmentType;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

/**
 * User: eroshenkoam
 * Date: 8/30/13, 6:31 PM
 */
@SuppressWarnings("unused")
public class CommonSteps {
    private static final String RESOURCES = "src/main/resources";

    private static final String TXT_ATTACH_FILE_NAME = "txt-sample.txt";
    private static final String XML_ATTACH_FILE_NAME = "xml-sample.xml";
    private static final String JSON_ATTACH_FILE_NAME = "json-sample.json";
    private static final String JPG_ATTACH_FILE_NAME = "jpg-sample.jpg";


    @Step("Make this test broken")
    public void makeThisTestBroken() throws IOException {
        throw new FileNotFoundException("No file found.");
    }

    @Step("Make this test failed")
    public void makeThisTestFailed() throws IOException {
        saveTxtFile();
        assertTrue("This test should be failed", false);
    }

    @Step("\"{0}\" step")
    public void step(String stepName) throws IOException {
    }

    @Step("Parent step")
    public void parentStep() throws IOException {
        step("First nested");
        step("Second nested");
        step("Third nested");
    }

    @Attach(name = "TXT Attachment", type = AttachmentType.TXT)
    public File saveTxtFile() throws IOException {
        return new File(RESOURCES, TXT_ATTACH_FILE_NAME);
    }

    @Attach(name = "JPG Attachment", type = AttachmentType.JPG)
    public File saveJpgFile() throws IOException {
        return new File(RESOURCES, JPG_ATTACH_FILE_NAME);
    }

    @Attach(name = "XML Attachment", type = AttachmentType.XML)
    public File saveXmlFile() throws IOException {
        return new File(RESOURCES, XML_ATTACH_FILE_NAME);
    }

    @Attach(name = "JSON Attachment", type = AttachmentType.JSON)
    public File saveJsonFile() throws IOException {
        return new File(RESOURCES, JSON_ATTACH_FILE_NAME);
    }
}
