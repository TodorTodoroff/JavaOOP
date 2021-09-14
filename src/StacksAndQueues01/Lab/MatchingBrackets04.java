package StacksAndQueues01.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Integer> bracketIndexes = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                bracketIndexes.push(i);
            }
            if (input.charAt(i) == ')') {
                System.out.println(input.substring(bracketIndexes.pop(), i + 1));
            }
        }

    }
}
