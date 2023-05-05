import java.io.IOException;
import java.util.ArrayList;

public class MainPedraza {

    public static void main(String str[]) throws IOException {
        DeckPedraza deck = new DeckPedraza();

        ArrayList<Card> hand1 = new ArrayList<Card>();
        ArrayList<Card> hand2 = new ArrayList<Card>();

        for (int i = 0; i < 5; i++) {
            hand1.add(deck.getTopCard());
            hand2.add(deck.getTopCard());
        }

        int hand1Points = 0;
        int hand2Points = 0;

        System.out.println("Hand 1: ");
        for (Card card : hand1) {
            System.out.println(card.toString());
            hand1Points += card.getPointValue();
        }
        System.out.println("Total points: " + hand1Points);

        System.out.println("\nHand 2: ");
        for (Card card : hand2) {
            System.out.println(card.toString());
            hand2Points += card.getPointValue();
        }
        System.out.println("Total points: " + hand2Points);

        if (hand1Points > hand2Points) {
            System.out.println("\nHand 1 wins");
        } else {
            System.out.println("\nHand 2 wins");
        }
    }
}
