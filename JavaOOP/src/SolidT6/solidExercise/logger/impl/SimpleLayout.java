package SolidT6.solidExercise.logger.impl;

import SolidT6.solidExercise.logger.enums.ReportLevel;
import SolidT6.solidExercise.logger.interfaces.Layout;
public class SimpleLayout implements Layout {

    @Override
    public String format(String time, String message, ReportLevel reportLevel) {
        return String.format("%s - %s - %s", time,reportLevel,message);
    }
}
