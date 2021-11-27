package SolidT6.solidExercise.logger.interfaces;

import SolidT6.solidExercise.logger.enums.ReportLevel;

public interface Appender {
    void append(String time, String message, ReportLevel reportLevel);
}
