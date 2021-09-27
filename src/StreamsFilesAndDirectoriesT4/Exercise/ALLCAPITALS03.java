package StreamsFilesAndDirectoriesT4.Exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ALLCAPITALS03 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\Az\\Desktop\\JavaProjects\\src\\StreamsFilesAndDirectoriesT4\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        List<String> allLines = Files.readAllLines(path);
        List<String> capitals = new ArrayList<>();

        int sum = 0;
        for (String line : allLines) {
            StringBuilder currentString = new StringBuilder();
            for (int i = 0; i < line.length(); i++) {
                char current = line.charAt(i);
                if (current > 96 && current < 123) {
                    current -= 32;
                }
                currentString.append(current);
            }
            capitals.add(currentString.toString());
        }
        Files.write(Path.of("output.txt"),capitals);
    }
}
