/**
 * Created by pwieczorek on 04.09.16.
 */
public class MainApplication {

    public static void main(String[] args) {

        Card card1 = new Card(5,2);
        Card card2 = new Card(7,0);
        Card card3 = new Card(4,3);
        Card card4 = new Card(6,1);

        System.out.println(card1.toString() + "\n" + card2.toString() + "\n"+card3.toString() + "\n"+card4.toString());
    }
}
