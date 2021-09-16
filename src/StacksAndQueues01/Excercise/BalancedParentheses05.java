package StacksAndQueues01.Excercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Character> opened = new ArrayDeque<>();
        String input = scanner.nextLine();
        boolean areBalanced = false;

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current == '(' || current == '[' || current == '{') {
                opened.push(current);
            } else if (current == ')' || current == ']' || current == '}') {
                if (opened.isEmpty()){
                    areBalanced = false;
                    break;
                }
                char lastOpenedBracket = opened.pop();
                if (lastOpenedBracket == '(' && current == ')') {
                    areBalanced = true;
                } else if (lastOpenedBracket == '[' && current == ']') {
                    areBalanced = true;
                } else if (lastOpenedBracket == '{' && current == '}') {
                    areBalanced = true;
                } else {
                    areBalanced = false;
                    break;
                }
            }


        }
        if (areBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}