package WorkingWithAbstractionT1.Exercise.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rank = scanner.nextLine();
        String suite = scanner.nextLine();

        Card card = new Card(CardRanks.valueOf(rank), CardSuits.valueOf(suite));

        System.out.printf("Card name: %s of %s; Card power: %d"
                ,card.getCardRankName()
                ,card.getCardSuiteName()
                ,card.calculateCardPower());

    }
}
