package SolidT6.solidExercise.logger.impl;

import SolidT6.solidExercise.logger.enums.ReportLevel;
import SolidT6.solidExercise.logger.interfaces.Appender;
import SolidT6.solidExercise.logger.interfaces.Layout;

public class ConsoleAppender implements Appender {

    Layout layout;

    public ConsoleAppender(Layout layout) {
        this.layout = layout;
    }

    @Override
    public void append(String time, String message, ReportLevel reportLevel) {
        String formattedMessage = this.layout.format(time,message,reportLevel);
        System.out.println(formattedMessage);
    }
}
