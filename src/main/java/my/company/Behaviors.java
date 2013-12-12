package my.company;

import ru.yandex.qatools.allure.annotations.FeatureClass;
import ru.yandex.qatools.allure.annotations.StoryClass;

/**
 * @author Boris Serdyuk just-boris@yandex-team.ru
 *         Date: 12/9/13
 */
public class Behaviors {
    @FeatureClass("")
    public class Screenshot {

        @StoryClass("")
        public class WebdriverScreenshot {

        }


        @StoryClass("")
        public class OtherScreenshot {

        }

    }

    @FeatureClass("")
    public class SimpleStories {

        @StoryClass("")
        public class SuccessStory {

        }


        @StoryClass("")
        public class ParametrizedStory {

        }
    }
}
