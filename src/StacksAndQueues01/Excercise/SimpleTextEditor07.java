package StacksAndQueues01.Excercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> text = new ArrayDeque<>();
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder currentText = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            switch (command[0]) {
                case "1":
                    String textToAdd = command[1];
                    currentText.append(textToAdd);
                    text.push(currentText.toString());
                    break;
                case "2":
                    int countElements = Integer.parseInt(command[1]);
                    currentText.delete(currentText.length() - countElements, currentText.length());
                    text.push(currentText.toString());
                    break;
                case "3":
                    int index = Integer.parseInt(command[1]) - 1;
                    char ch = currentText.charAt(index);
                    System.out.println(ch);
                    break;
                case "4":
                    if (text.size() > 1) {
                        text.pop();
                        currentText = new StringBuilder(text.peek());
                    } else {
                        currentText = new StringBuilder();
                    }
                    break;
            }

        }

    }
}
