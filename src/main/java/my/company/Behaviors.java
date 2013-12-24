package my.company;

import ru.yandex.qatools.allure.annotations.FeatureClass;
import ru.yandex.qatools.allure.annotations.StoryClass;

/**
 * @author Boris Serdyuk just-boris@yandex-team.ru
 *         Date: 12/9/13
 */
public class Behaviors {
    @FeatureClass("Screenshot")
    public class Screenshot {

        @StoryClass("WebdriverScreenshot")
        public class WebdriverScreenshot {

        }


        @StoryClass("OtherScreenshot")
        public class OtherScreenshot {

        }

    }

    @FeatureClass("SimpleStories")
    public class SimpleStories {

        @StoryClass("SuccessStory")
        public class SuccessStory {

        }


        @StoryClass("ParametrizedStory")
        public class ParametrizedStory {

        }
    }
}
