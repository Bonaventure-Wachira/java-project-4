import java.util.ArrayList;

public class DeckPedraza {
    private ArrayList<Card> deck;

    public DeckPedraza() {
        deck = new ArrayList<Card>();
        initializeDeck();
        deck = shuffleDeck();
    }

    private void initializeDeck() {
        String[] suits = {"hearts", "diamonds", "clubs", "spades"};
        String[] ranks = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                deck.add(new Card(ranks[i], suit, i + 1));
            }
        }
    }

    public Card getTopCard() {
        if (!deck.isEmpty()) {
            Card topCard = deck.get(0);
            deck.remove(0);
            return topCard;
        }
        return null;
    }

    public ArrayList<Card> shuffleDeck() {
        ArrayList<Card> t = new ArrayList<Card>();

        int i = 0;
        int n[] = new int[52];

        for (int j = 0; j < 52; j++) {
            i = (int) (Math.random() * 52);

            while (n[i] != 0)
                i = (int) (Math.random() * 52);

            n[i] = 1;
            t.add(deck.get(i));
        }
        return t;
    }
}
