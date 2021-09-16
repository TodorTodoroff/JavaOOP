package StacksAndQueues01.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stackURLs = new ArrayDeque<>();
        ArrayDeque<String> forwardStack = new ArrayDeque<>();

        String input = "";

        while (!"Home".equals(input = scanner.nextLine())) {

            if ("back".equals(input)) {

                if (stackURLs.size() > 1) {
                    String toRemove = stackURLs.pop();
                    forwardStack.push(toRemove);
                    System.out.println(stackURLs.peek());

                } else {
                    System.out.println("no previous URLs");
                }

                continue;
            }



            if ("forward".equals(input)) {

                if (forwardStack.size() > 0) {
                    String something = forwardStack.pop();
                    System.out.println(something);
                    stackURLs.push(something);

                } else {
                    System.out.println("no next URLs");
                }

                continue;
            }


            System.out.println(input);
            stackURLs.push(input);
            forwardStack.clear();

        }
    }
}