package StreamsFilesAndDirectoriesT4.Lab;

import java.io.*;

public class WriteEveryThirdLine05 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Az\\Desktop\\JavaProjects\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader reader = new BufferedReader(inputStreamReader);
        BufferedWriter writer = new BufferedWriter(new PrintWriter("C:\\Users\\Az\\Desktop\\JavaProjects\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\thirdLine.txt"));

        String line = reader.readLine();

        int count = 1;
        while (line != null) {
            if (count % 3 == 0) {
                writer.write(line + System.lineSeparator());
            }
            line = reader.readLine();
            count++;
        }
        writer.flush();
    }
}
