package StreamsFilesAndDirectoriesT4.Lab;

import java.io.FileInputStream;
import java.io.IOException;


public class ReadFile01 {
    public static void main(String[] args) {


        String path = "C:\\Users\\Az\\Desktop\\JavaProjects\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);

            int oneByte = fileInputStream.read();

            while (oneByte > -1) {
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                oneByte = fileInputStream.read();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }finally {
            //add code here
            //executes always no matter if there is an exception or not
            //System.out.println("Operation completed!");
        }

    }
}
