package SolidT6.solidExercise.logger;

import SolidT6.solidExercise.logger.impl.ConsoleAppender;
import SolidT6.solidExercise.logger.impl.MessageLogger;
import SolidT6.solidExercise.logger.impl.SimpleLayout;
import SolidT6.solidExercise.logger.interfaces.Appender;
import SolidT6.solidExercise.logger.interfaces.Layout;
import SolidT6.solidExercise.logger.interfaces.Logger;

public class Main {
    public static void main(String[] args) {

        Layout simpleLayout = new SimpleLayout();
        Appender consoleAppender = new ConsoleAppender(simpleLayout);
        Logger logger = new MessageLogger(consoleAppender);

        logger.logError("3/26/2015 2:08:11 PM", "Error parsing JSON.");
        logger.logInfo("3/26/2015 2:08:11 PM", "User Pesho successfully registered.");


    }
}
