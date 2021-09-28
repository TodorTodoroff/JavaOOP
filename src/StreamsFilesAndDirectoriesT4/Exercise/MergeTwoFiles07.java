package StreamsFilesAndDirectoriesT4.Exercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFiles07 {
    public static void main(String[] args) throws IOException {

        Path fileOnePath = Path.of("C:\\Users\\Az\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt");
        Path fileTwoPath = Path.of("C:\\Users\\Az\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt");

        List<String> firstAllLines = Files.readAllLines(fileOnePath);
        List<String> secondAllLines = Files.readAllLines(fileTwoPath);

        PrintWriter writer = new PrintWriter("C:\\Users\\Az\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\outputMerge.txt");

        firstAllLines.forEach(writer::println);
        secondAllLines.forEach(writer::println);

        writer.close();
    }
}
