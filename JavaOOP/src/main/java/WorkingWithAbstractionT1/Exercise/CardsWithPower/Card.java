package WorkingWithAbstractionT1.Exercise.CardsWithPower;

public class Card {
    private final CardSuits cardSuits;
    private final CardRanks cardRanks;

    public Card(CardRanks cardRanks,CardSuits cardSuits) {
        this.cardRanks = cardRanks;
        this.cardSuits = cardSuits;
    }

    public String getCardRankName() {
        return this.cardRanks.name();
    }
    public String getCardSuiteName(){
        return this.cardSuits.name();
    }

    public int calculateCardPower(){
        return cardRanks.getRankPower() + cardSuits.getSuitPower();
    }
}
