package SetsAndMapsAdvancedT3.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class VoinaNumberGame03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int rounds = 50;

        while (rounds-- > 0 && !firstPlayer.isEmpty() && !secondPlayer.isEmpty()) {
            Iterator<Integer> firstIterator = firstPlayer.iterator();
            Iterator<Integer> secondIterator = secondPlayer.iterator();
//            int firstCard = 0;
//            for (Integer integer : firstPlayer){
//                firstCard = integer;
//                break;
//            }
//            firstPlayer.remove(firstCard);

            int firstCard = firstIterator.next();
            firstIterator.remove();
            int secondCard = secondIterator.next();
            secondIterator.remove();

            if (firstCard > secondCard) {
                firstPlayer.add(secondCard);
                firstPlayer.add(firstCard);
            } else if (secondCard > firstCard) {
                secondPlayer.add(firstCard);
                secondPlayer.add(secondCard);
            }
        }
        String output = "";
        if (firstPlayer.size() > secondPlayer.size()) {
            output = "First player win!";
        } else if (firstPlayer.size() < secondPlayer.size()) {
            output = "Second player win!";
        } else {
            output = "Draw!";
        }
        System.out.println(output);

    }
}
