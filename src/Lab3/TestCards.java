package Lab3;

import java.util.ArrayList;

public class TestCards {
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<>();
        Card[] cardArr;
        for (int i = 1; i <= 13; i++) {
            Card hearts = new Card(i, "Hearts");
            Card clubs = new Card(i, "Clubs");
            Card spades = new Card(i, "Spades");
            Card diamonds = new Card(i, "Diamonds");
            cards.add(hearts);
            cards.add(clubs);
            cards.add(spades);
            cards.add(diamonds);
        }
        cardArr = new Card[cards.size()];
        cardArr = cards.toArray(cardArr);
        Deck deck = new Deck(cardArr);
        Deck.shuffle(deck.getCards());
        System.out.println(deck);
    }
}
