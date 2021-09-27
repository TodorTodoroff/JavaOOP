package StreamsFilesAndDirectoriesT4.Exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumBytes02 {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("C:\\Users\\Az\\Desktop\\JavaProjects\\src\\StreamsFilesAndDirectoriesT4\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt") ;
        List<String> allLines = Files.readAllLines(path);

        int sum = 0;
        for(String line : allLines){

            for (int i = 0; i < line.length(); i++) {
                char current = line.charAt(i);
                sum += current;
            }
        }
        System.out.println(sum);


    }
}
