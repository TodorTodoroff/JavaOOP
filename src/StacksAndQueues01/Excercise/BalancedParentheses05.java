package StacksAndQueues01.Excercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> parentheses = new ArrayDeque<>();
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (i < input.length() / 2) {
                parentheses.push(String.valueOf(input.charAt(i)));
            } else {
                if (input.charAt(i) == ')' && parentheses.peek().equals("(")) {
                    parentheses.pop();
                } else if (input.charAt(i) == '}' && parentheses.peek().equals("{")) {
                    parentheses.pop();
                } else if (input.charAt(i) == ']' && parentheses.peek().equals("[")) {
                    parentheses.pop();
                }
            }

        }
        if (parentheses.isEmpty()){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}