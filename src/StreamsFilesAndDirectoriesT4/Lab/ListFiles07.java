package StreamsFilesAndDirectoriesT4.Lab;

import java.io.File;
import java.io.IOException;

public class ListFiles07 {
    public static void main(String[] args) throws IOException {

        File file = new File("D:\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        File[] currentFile = file.listFiles();

        for (File f : currentFile){
            if (!f.isDirectory()){
                System.out.println(f.getName() + ": " + "[" + f.length() + "]");
            }
        }

    }
}
