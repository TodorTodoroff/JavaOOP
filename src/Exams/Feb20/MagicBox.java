package Exams.Feb20;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class MagicBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstBox = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] secondBox = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        ArrayDeque<Integer> firstBoxStack = new ArrayDeque<>();
        ArrayDeque<Integer> secondBoxStack = new ArrayDeque<>();

        for (int box : firstBox) {
            firstBoxStack.offer(box);
        }
        for (int box : secondBox) {
            secondBoxStack.push(box);
        }

        int sum = 0;

        while (firstBoxStack.size() > 0 && secondBoxStack.size() > 0) {
            int firstNum = firstBoxStack.peek();
            int secondNum = secondBoxStack.pop();

            if ((firstNum + secondNum) % 2 == 0) {
                firstBoxStack.pop();

                sum += firstNum + secondNum;

            } else {
                firstBoxStack.offer(secondNum);
            }
        }
        String outputBox = firstBoxStack.isEmpty() ? "First magic box is empty." : "Second magic box is empty";
        String itemsValue = sum >= 90 ? "Wow, your prey was epic! Value: "
                : "Poor prey... Value: ";

        System.out.println(outputBox);
        System.out.println(itemsValue + sum);
    }
}