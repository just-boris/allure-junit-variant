package my.company;

import ru.yandex.qatools.allure.annotations.FeatureClass;
import ru.yandex.qatools.allure.annotations.StoryClass;

/**
 * @author Boris Serdyuk just-boris@yandex-team.ru
 *         Date: 12/9/13
 */
public class Behaviors {
    @FeatureClass("")
    public class MyFirstFeature {

        @StoryClass("")
        public class MyFirstStory {

        }


        @StoryClass("")
        public class MySecondStory {

        }

    }

    @FeatureClass("")
    public class MySecondFeature {

        @StoryClass("")
        public class MyAmazingStory {

        }


        @StoryClass("")
        public class MyHorrorStory {

        }
    }
}
