/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) 
    {
        Card c1=new Card("4","Spades",4);
        Card c2=new Card("4","Spades",4);
        Card c3=new Card("7","Hearts",7);
        System.out.println("Suit: "+c1.suit()+" Rank: "+c1.rank()+" Point Value: "+c1.pointValue());
        if(c1.matches(c2)==true)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        System.out.println(c1.toString());
    }
}
