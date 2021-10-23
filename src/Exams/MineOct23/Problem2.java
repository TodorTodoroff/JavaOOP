package Exams.MineOct23;

import java.util.*;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> ingredientsNumberQueue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> freshnesIngredientsStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).forEach(freshnesIngredientsStack::push);

        int pearSour = 0;
        int theHarvest = 0;
        int appleHinny = 0;
        int highFashion = 0;

        while (!freshnesIngredientsStack.isEmpty() && !ingredientsNumberQueue.isEmpty()) {
            if (ingredientsNumberQueue.peek() == 0) {
                ingredientsNumberQueue.poll();
                continue;
            }
            int ingred = ingredientsNumberQueue.peek();
            int fresh = freshnesIngredientsStack.peek();
            int sum = ingred * fresh;

            if (sum == 150) {
                pearSour++;
                ingredientsNumberQueue.poll();
                freshnesIngredientsStack.pop();
            } else if (sum == 250) {
                theHarvest++;
                ingredientsNumberQueue.poll();
                freshnesIngredientsStack.pop();
            } else if (sum == 300) {
                appleHinny++;
                ingredientsNumberQueue.poll();
                freshnesIngredientsStack.pop();
            } else if (sum == 400) {
                highFashion++;
                ingredientsNumberQueue.poll();
                freshnesIngredientsStack.pop();
            } else {
                ingredientsNumberQueue.offer(ingredientsNumberQueue.poll() + 5);
                freshnesIngredientsStack.pop();
            }
        }

        if (pearSour > 0 && theHarvest > 0 && appleHinny > 0 && highFashion > 0){
            System.out.println("It's party time! The cocktails are ready!");
        }else {
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
        }

        if (!ingredientsNumberQueue.isEmpty()) {
            int sum = 0;
            for (Integer integer : ingredientsNumberQueue) {
                sum += integer;
            }

            System.out.println("Ingredients left: " + sum);
        }

        if (appleHinny > 0) {
            System.out.printf(" # Apple Hinny --> %d%n", appleHinny);
        }
        if (highFashion > 0) {
            System.out.printf(" # High Fashion --> %d%n", highFashion);
        }
        if (pearSour > 0) {
            System.out.printf(" # Pear Sour --> %d%n", pearSour);
        }
        if (theHarvest > 0) {
            System.out.printf(" # The Harvest --> %d", theHarvest);
        }


    }
}

