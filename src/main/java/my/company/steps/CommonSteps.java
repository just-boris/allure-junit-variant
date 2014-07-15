package my.company.steps;

import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

import javax.ws.rs.core.MediaType;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

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

    @Attachment("TXT Attachment")
    public byte[] saveTxtFile() throws IOException {
        return Files.readAllBytes(Paths.get(RESOURCES, TXT_ATTACH_FILE_NAME));
    }

    @Attachment("JPG Attachment")
    public byte[] saveJpgFile() throws IOException {
        return Files.readAllBytes(Paths.get(RESOURCES, JPG_ATTACH_FILE_NAME));
    }

    @Attachment("XML Attachment")
    public byte[] saveXmlFile() throws IOException {
        return Files.readAllBytes(Paths.get(RESOURCES, XML_ATTACH_FILE_NAME));
    }

    @Attachment("JSON Attachment")
    public byte[] saveJsonFile() throws IOException {
        return Files.readAllBytes(Paths.get(RESOURCES, JSON_ATTACH_FILE_NAME));
    }

    @Attachment(value = "System Environment", type = MediaType.TEXT_PLAIN)
    public byte[] getSystemProperties() {
        Properties props = System.getProperties();
        StringBuilder result = new StringBuilder();
        for (String prop : props.stringPropertyNames()) {
            result.append(prop)
                  .append(" = ")
                  .append(System.getProperty(prop))
                  .append("\n");
        }
        return result.toString().getBytes();
    }
}
