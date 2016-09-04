/**
 * Created by pwieczorek on 04.09.16.
 */
public class Card {

    static final int DIAMONDS=0;
    static final int HEARTS=1;
    static final int SPADES=2;
    static final int CLUBS=3;

    static final int ACE=4;
    static final int KING=5;
    static final int QUEEN=6;
    static final int JACK=7;

    private int rank;
    private int suit;

    public Card(int rank, int suit){
        if(rank == ACE || rank == KING || rank == QUEEN || rank == JACK) {
            this.rank=rank;
        } else {
            throw new IllegalArgumentException("Zła figura!");
        }

        if(suit == DIAMONDS || suit == HEARTS || suit == SPADES || suit == CLUBS) {
            this.suit=suit;
        } else {
            throw new IllegalArgumentException("Zły kolor!");
        }

    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    public String toString() {
        String rank;
        String suit;

        switch (this.rank) {
            case ACE:
                rank = "Ace";
                break;

            case KING:
                rank = "King";
                break;

            case QUEEN:
                rank = "Queen";
                break;

            case JACK:
                rank = "Jack";
                break;

            default:
                rank = "Wrong Rank!";
        }

        switch (this.suit) {
            case DIAMONDS:
                suit = "Diamonds";
                break;

            case CLUBS:
                suit = "Clubs";
                break;

            case SPADES:
                suit = "Spades";
                break;

            case HEARTS:
                suit = "Hearts";
                break;

            default:
                suit = "Wrong suit!";
        }

        return rank + " - " + suit;
    }
}
