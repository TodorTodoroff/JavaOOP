package Exams.Feb22;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LootBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<Integer> queue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(stack::push);

        int sum = 0;

        while (!queue.isEmpty() && !stack.isEmpty()) {
            int firstNum = queue.peek();
            int secondNum = stack.pop();
            if ((firstNum + secondNum) % 2 == 0) {
                sum += firstNum + secondNum;
                queue.poll();
            } else {
                queue.offer(secondNum);
            }

        }

        String outputBox = queue.isEmpty() ? "First lootbox is empty" : "Second lootbox is empty";
        String outputLoot = sum >= 100 ? "Your loot was epic! Value: " :
                "Your loot was poor... Value: ";

        System.out.println(outputBox);
        System.out.println(outputLoot + sum);
    }
}
