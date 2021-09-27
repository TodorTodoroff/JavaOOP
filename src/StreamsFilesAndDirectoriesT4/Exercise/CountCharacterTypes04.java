package StreamsFilesAndDirectoriesT4.Exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class CountCharacterTypes04 {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("C:\\Users\\Az\\Desktop\\JavaProjects\\src\\StreamsFilesAndDirectoriesT4\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        List<String> allLines = Files.readAllLines(path);
        List<Character> vowels = Arrays.asList('a','e','u','i','o') ;
        List<Character> punctuations = Arrays.asList('!',',','.','?');


        int vowel = 0, consonants = 0, punctuation = 0;
        for (String line : allLines) {
            for (int i = 0; i < line.length(); i++) {
                char current = line.charAt(i);
                if (!Character.isWhitespace(current)) {
                    if (vowels.contains(current)) {
                        vowel++;
                    } else if (!vowels.contains(current)&&!punctuations.contains(current)) {
                        consonants++;
                    } else if (punctuations.contains(current)){
                        punctuation++;
                    }
                }
            }
        }

        System.out.printf("Vowels: %d%nConsonants: %d%nPunctuation: %d%n",vowel,consonants,punctuation);
    }
}
