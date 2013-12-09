package my.company.steps;

import org.json.JSONArray;
import ru.yandex.qatools.allure.annotations.Attach;
import ru.yandex.qatools.allure.model.AttachmentType;

public class BackendSteps {
    public BackendSteps() {
    }

    @Attach(name = "Server Log", type = AttachmentType.TXT)
    public String getLog() {
        return "I kinda like a log";
    }

    @Attach(name = "Response", type = AttachmentType.JSON)
    public String getResponse() {
        return "{\"success\": true, \"data\": {\"name\": \"\", \"value\": 0}}";
    }
}
