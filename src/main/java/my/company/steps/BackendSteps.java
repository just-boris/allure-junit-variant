package my.company.steps;

import ru.yandex.qatools.allure.annotations.Attachment;

import javax.ws.rs.core.MediaType;

public class BackendSteps {
    public BackendSteps() {
    }

    @Attachment(value="Server Log", type = MediaType.TEXT_PLAIN)
    public String getLog() {
        return "I kinda like a log";
    }

    @Attachment("Response")
    public String getResponse() {
        return "{\"success\": true, \"data\": {\"name\": \"\", \"value\": 0}}";
    }
}
