package Exams.June26;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OSPlaning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> taskStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(taskStack::push);

        ArrayDeque<Integer> threadQueue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        int taskValue = Integer.parseInt(scanner.nextLine());

        int currentThread = 0;
        while (!taskStack.isEmpty() && !threadQueue.isEmpty()) {
            int currentTask = taskStack.peek();
            currentThread = threadQueue.peek();

            if (currentThread >= currentTask) {
                taskStack.pop();
            }
            if (currentTask == taskValue) {
                break;
            }
            threadQueue.poll();
        }

        System.out.println("Thread with value " + currentThread + " killed task " + taskValue);
        System.out.println(String.join(" ", threadQueue.toString()).replace("[","")
                .replace("]","")
                .replace(",",""));
    }
}
