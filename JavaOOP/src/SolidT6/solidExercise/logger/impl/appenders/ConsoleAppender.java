package SolidT6.solidExercise.logger.impl.appenders;

import SolidT6.solidExercise.logger.enums.ReportLevel;
import SolidT6.solidExercise.logger.interfaces.Layout;

public class ConsoleAppender extends BaseAppender {

    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void append(String time, String message, ReportLevel reportLevel) {
        String formattedMessage = this.layout.format(time, message, reportLevel);
        System.out.println(formattedMessage);
    }
}
