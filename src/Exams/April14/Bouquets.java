package Exams.April14;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bouquets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int flowersLeft = 0;
        int bouquets = 0;

        ArrayDeque<Integer> daffodilsQueue = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> tulipsStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).forEach(tulipsStack::push);

        while (!daffodilsQueue.isEmpty() && !tulipsStack.isEmpty()) {
            int daffodil = daffodilsQueue.poll();
            int tulip = tulipsStack.pop();

            while (daffodil + tulip > 15) {
                tulip -= 2;
            }
            if (daffodil + tulip == 15) {
                bouquets++;
            } else if (daffodil + tulip < 15) {
                flowersLeft += daffodil + tulip;
            }
        }

        while (flowersLeft - 15 > 0) {
            flowersLeft -= 15;
            bouquets++;
        }
        System.out.println(bouquets >= 5 ? String.format("You made it! You go to the competition with %d bouquets!", bouquets)
                : String.format("You failed... You need more %d bouquets.", 5 - bouquets));

    }
}
