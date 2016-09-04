/**
 * Created by pwieczorek on 04.09.16.
 */
enum Rank{
    ACE("Ace"), KING("King"), QUEEN("Queen"), JACK("Jack");

    private final String rank;

    Rank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}