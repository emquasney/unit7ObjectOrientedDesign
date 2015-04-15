

/**
 * Write a description of class CallingCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CallingCard extends Card
{
    private String cardNum;
    private String pin;
    public CallingCard(String n, String cardNumber,String pinNum)
    {
        super(n);
        cardNum=cardNumber;
        pin=pinNum;
    }
}
