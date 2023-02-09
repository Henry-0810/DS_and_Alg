package Lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Deck {
    private Card[] cards;

    public Deck(Card[] cards) {
        setCards(cards);
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public static void shuffle(Card[] cards){
        for (int i = 0; i < cards.length; i++) {
            int index = new Random().nextInt(cards.length);

            Card temp = cards[i];
            cards[i] = cards[index];
            cards[index] = temp;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(getCards());
    }
}
