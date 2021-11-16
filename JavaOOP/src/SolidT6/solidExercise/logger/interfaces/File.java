package SolidT6.solidExercise.logger.interfaces;

public interface File {
    int getSize();

    boolean write(String text);

    void append(String text);

}
