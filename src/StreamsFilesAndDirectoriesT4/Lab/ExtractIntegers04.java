package StreamsFilesAndDirectoriesT4.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ExtractIntegers04 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Az\\Desktop\\JavaProjects\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(path);

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Az\\Desktop\\JavaProjects\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\out.txt");
        PrintStream out = new PrintStream(fileOutputStream);
        Scanner scanner = new Scanner(fileInputStream);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                out.println(number);
            }
            scanner.next();

        }
        fileOutputStream.close();
        fileInputStream.close();
    }
}
