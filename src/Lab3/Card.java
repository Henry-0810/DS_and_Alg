package Lab3;

public class Card {
    private int face;
    private String suit;

    public Card(int face, String suit) {
        setFace(face);// 1 to 13 representing Ace to King
        setSuit(suit);//"H", "D", "Clubs", or "Spades"
    }

    public int getFace() {
        return face;
    }

    public String getSuit() {
        return suit;
    }

    public void setFace(int face) {
        this.face = face;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return " " + getFace() + " of " + getSuit();
    }
}
