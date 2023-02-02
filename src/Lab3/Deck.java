package Lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

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

    public Card[] shuffle(Card[] cards){
        ArrayList<Card> shuffledCards = new ArrayList<>();
        HashSet<Integer> shuffleOrder = new HashSet<>();
        while(shuffleOrder.size() <= cards.length){
            int num = (int) (Math.random() * cards.length);
            shuffleOrder.add(num);
        }
        for (int i = 0; i < shuffleOrder.size(); i++) {
            System.out.println();
        }

        return null;
    }
}
