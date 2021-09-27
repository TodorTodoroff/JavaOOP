package StreamsFilesAndDirectoriesT4.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineNumbers05 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Az\\Desktop\\JavaProjects\\src\\StreamsFilesAndDirectoriesT4" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";


        BufferedReader reader = new BufferedReader(new FileReader(path));


    }
}
