package SolidT6.solidExercise.logger;

<<<<<<< HEAD
import SolidT6.solidExercise.logger.impl.appenders.ConsoleAppender;
import SolidT6.solidExercise.logger.impl.appenders.FileAppender;
import SolidT6.solidExercise.logger.impl.MessageLogger;
import SolidT6.solidExercise.logger.impl.SimpleLayout;
import SolidT6.solidExercise.logger.impl.appenders.LogFile;
import SolidT6.solidExercise.logger.interfaces.Appender;
import SolidT6.solidExercise.logger.interfaces.File;
import SolidT6.solidExercise.logger.interfaces.Layout;
import SolidT6.solidExercise.logger.interfaces.Logger;


=======
import SolidT6.solidExercise.logger.impl.ConsoleAppender;
import SolidT6.solidExercise.logger.impl.MessageLogger;
import SolidT6.solidExercise.logger.impl.SimpleLayout;
import SolidT6.solidExercise.logger.interfaces.Appender;
import SolidT6.solidExercise.logger.interfaces.Layout;
import SolidT6.solidExercise.logger.interfaces.Logger;

>>>>>>> github/master
public class Main {
    public static void main(String[] args) {

        Layout simpleLayout = new SimpleLayout();
        Appender consoleAppender = new ConsoleAppender(simpleLayout);
<<<<<<< HEAD

        File file = new LogFile();
        Appender fileAppender = new FileAppender(simpleLayout);
        ((FileAppender) fileAppender).setFile(file);

        Logger logger = new MessageLogger(consoleAppender, fileAppender);
=======
        Logger logger = new MessageLogger(consoleAppender);
>>>>>>> github/master

        logger.logError("3/26/2015 2:08:11 PM", "Error parsing JSON.");
        logger.logInfo("3/26/2015 2:08:11 PM", "User Pesho successfully registered.");


<<<<<<< HEAD


=======
>>>>>>> github/master
    }
}
