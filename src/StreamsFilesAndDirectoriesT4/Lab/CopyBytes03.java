package StreamsFilesAndDirectoriesT4.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class CopyBytes03 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Az\\Desktop\\JavaProjects\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Az\\Desktop\\JavaProjects\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\CopyBytes.txt");

        PrintStream out = new PrintStream(outputStream);

        int value = 0;
        while ((value = inputStream.read()) >= 0) {
            if (value == 10 || value == 32) {
                out.write(value);
            } else {
                String digits = String.valueOf(value);
                for (int i = 0; i < digits.length(); i++) {
                    out.write(digits.charAt(i));
                }
            }
        }

    }
}
