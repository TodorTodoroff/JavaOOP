package StreamsFilesAndDirectoriesТ4.Lab;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile01 {
    public static void main(String[] args)throws IOException {


        String path = "C:\\Users\\Az\\Desktop\\JavaProjects\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        int oneByte = fileInputStream.read();

        while (oneByte >= 0){
            System.out.print(oneByte);
            oneByte = fileInputStream.read();
        }


    }
}
