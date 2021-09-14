package StacksAndQueues01.Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> equation = new ArrayDeque<>();

        String[] input = scanner.nextLine().split("\\s+");
        Collections.addAll(equation, input);

        while (equation.size() > 1) {
            int first = Integer.parseInt(equation.pop());
            String operator = equation.pop();
            int second = Integer.parseInt(equation.pop());

            switch (operator) {
                case "+":
                    equation.push(String.valueOf(first + second));
                    break;
                case "-":
                    equation.push(String.valueOf(first-second));
                    break;
            }
        }
        System.out.println(equation.pop());
    }
}
