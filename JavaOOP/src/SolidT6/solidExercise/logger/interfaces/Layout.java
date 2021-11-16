package SolidT6.solidExercise.logger.interfaces;

import SolidT6.solidExercise.logger.enums.ReportLevel;

public interface Layout {
    String format(String time, String message, ReportLevel reportLevel);
}
