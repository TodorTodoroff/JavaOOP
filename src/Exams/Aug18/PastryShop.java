package Exams.Aug18;

import java.util.*;
import java.util.stream.Collectors;

public class PastryShop {
    static int biscuit = 0;
    static int cake = 0;
    static int pastry = 0;
    static int pie = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> liquidsQueue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> ingredientsStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .forEach(ingredientsStack::push);


        while (!ingredientsStack.isEmpty() && !liquidsQueue.isEmpty()) {
            int currentLiquid = liquidsQueue.poll();
            int currentIngredient = ingredientsStack.pop();


            if (currentIngredient + currentLiquid == 25) {
                biscuit++;
            } else if (currentIngredient + currentLiquid == 50) {
                cake++;

            } else if (currentIngredient + currentLiquid == 75) {
                pastry++;

            } else if (currentIngredient + currentLiquid == 100) {
                pie++;
            } else {
                currentIngredient += 3;
                ingredientsStack.push(currentIngredient);

            }
        }
        if (biscuit > 0 && cake > 0 && pastry > 0 && pie > 0) {
            System.out.println("Great! You succeeded in cooking all the food!");
        } else {
            System.out.println("What a pity! You didn't have enough materials to cook everything.");
        }
        if (liquidsQueue.isEmpty()) {
            System.out.println("Liquids left: none");
        } else {
            System.out.print("Liquids left: " + liquidsQueue.toString()
                    .replace("[", "")
                    .replace("]", ""));
        }
        if (ingredientsStack.isEmpty()) {
            System.out.println("Ingredients left: none");
        } else {
            System.out.println("Ingredients left: " + ingredientsStack.toString().replace("[", "")
                    .replace("]", ""));
        }
        System.out.println(String.format("Biscuit: %d%nCake: %d%nPie: %d%nPastry: %d", biscuit, cake, pie, pastry));
    }
}