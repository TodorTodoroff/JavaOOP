package StreamsFilesAndDirectoriesT4.Exercise;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineNumbers05 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Az\\Desktop\\JavaProjects\\src\\StreamsFilesAndDirectoriesT4" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        PrintWriter writer = new PrintWriter("outputLines.txt");
        List<String> lines = Files.readAllLines(Path.of(path));
        int counter = 1;
        for (String line : lines) {
            writer.println(counter++ + ". " + line);
        }
writer.close();

    }
}
