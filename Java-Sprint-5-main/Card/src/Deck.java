import java.util.ArrayList;
public class Deck {
    final int NumAllCards = 52;
    ArrayList<Cards> cards;
    public Deck() {
        cards = new ArrayList<Cards>(NumAllCards);
    }
    public void input() {
        final String[] suit = {"Hearts", "Spades", "Cube", "Diamonds"};
        for (int i = 0; i < 4; i++) {
            cards.add(new Cards(1, suit[i]));
            for (int j = 2; j < 14; j++) {
                cards.add(new Cards(j, suit[i]));
            }
        }
    }
    public void output() {
        for (int i = 0; i < cards.size(); i++) {
            Cards currentCard = cards.get(i);
            switch (cards.get(i).getRank()) {
                case 1:
                    System.out.println("Ace "+currentCard.getSuit());
                    break;
                case 11:
                    System.out.println("Jack "+currentCard.getSuit());
                    break;
                case 12:
                    System.out.println("Queen "+currentCard.getSuit());
                    break;
                case 13:
                    System.out.println("King "+currentCard.getSuit());
                    break;
                default:
                    System.out.println(currentCard.getRank()+" "+currentCard.getSuit());
            }
        }
    }
}