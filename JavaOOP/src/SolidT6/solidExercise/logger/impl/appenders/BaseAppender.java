package SolidT6.solidExercise.logger.impl.appenders;

import SolidT6.solidExercise.logger.interfaces.Appender;
import SolidT6.solidExercise.logger.interfaces.Layout;

public abstract class BaseAppender implements Appender {
    Layout layout;

    public BaseAppender(Layout layout) {
        this.layout = layout;
    }

}
