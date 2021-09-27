package StreamsFilesAndDirectoriesT4.Exercise;

import java.io.File;

public class GetFolderSize08 {
    public static void main(String[] args) {

        String path = "C:\\Users\\Az\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

        File folder = new File(path);
        File[] files = folder.listFiles();
        int folderSize = 0;
        for (File file : files) {
            folderSize += file.length();
        }

        System.out.println("Folder size: " + folderSize);
    }
}
