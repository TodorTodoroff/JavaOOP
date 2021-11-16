package SolidT6.solidExercise.logger.impl;

import SolidT6.solidExercise.logger.enums.ReportLevel;
import SolidT6.solidExercise.logger.interfaces.Appender;
import SolidT6.solidExercise.logger.interfaces.Logger;

import java.util.Arrays;

public class MessageLogger implements Logger {
    private Appender[] appenders;

    public MessageLogger(Appender... appenders) {
        this.appenders = appenders;
    }

    @Override
    public void logInfo(String time, String message) {
        Arrays.stream(appenders).forEach(appender -> appender.append(time, message, ReportLevel.INFO));
    }

    @Override
    public void logWarning(String time, String message) {
        log(time, message, ReportLevel.INFO);
    }

    @Override
    public void logError(String time, String message) {
        log(time, message, ReportLevel.ERROR);
    }

    @Override
    public void logCritical(String time, String message) {
        log(time, message, ReportLevel.CRITICAL);
    }

    @Override
    public void logFatal(String time, String message) {
        log(time, message, ReportLevel.FATAL);
    }

    private void log(String time, String message, ReportLevel reportLevel) {
        for (Appender appender : appenders) {
            appender.append(time, message, reportLevel);
        }
    }
}
