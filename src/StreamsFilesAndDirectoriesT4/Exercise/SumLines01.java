package StreamsFilesAndDirectoriesT4.Exercise;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines01 {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("C:\\Users\\Az\\Desktop\\JavaProjects\\src\\StreamsFilesAndDirectoriesT4\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt") ;
        List<String> allLines = Files.readAllLines(path);

        for(String line : allLines){

            int sum = 0;
            for (int i = 0; i < line.length(); i++) {
                char current = line.charAt(i);
                sum += current;
            }
            System.out.println(sum);
        }
    }
}
