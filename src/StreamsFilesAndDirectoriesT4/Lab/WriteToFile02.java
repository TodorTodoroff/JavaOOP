package StreamsFilesAndDirectoriesT4.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class WriteToFile02 {
    public static void main(String[] args) throws IOException {

        String inputPath = "C:\\Users\\Az\\Desktop\\JavaProjects\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "C:\\Users\\Az\\Desktop\\JavaProjects\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\out.txt";

        FileInputStream fileInputStream = new FileInputStream(inputPath);
        FileOutputStream outputStream = new FileOutputStream(outputPath);

        int value = fileInputStream.read();
        Set<Character> punctuations = Set.of(',', '.', '!', '?');
        while (value > -1) {
            char current = (char) value;
            if (!punctuations.contains(current)) {
                outputStream.write(value);
            }
            value = fileInputStream.read();
        }
        fileInputStream.close();
        outputStream.close();
    }
}
