package Exams.Feb20;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MagicBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> firstBoxQueue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> secondBoxStack = new ArrayDeque<>();

                Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(secondBoxStack::push);


        int sum = 0;

        while (firstBoxQueue.size() > 0 && secondBoxStack.size() > 0) {
            int firstNum = firstBoxQueue.peek();
            int secondNum = secondBoxStack.pop();

            if ((firstNum + secondNum) % 2 == 0) {
                firstBoxQueue.pop();

                sum += firstNum + secondNum;

            } else {
                firstBoxQueue.offer(secondNum);
            }
        }
        String outputBox = firstBoxQueue.isEmpty() ? "First magic box is empty." : "Second magic box is empty.";
        String itemsValue = sum >= 90 ? "Wow, your prey was epic! Value: "
                : "Poor prey... Value: ";

        System.out.println(outputBox);
        System.out.println(itemsValue + sum);
    }
}