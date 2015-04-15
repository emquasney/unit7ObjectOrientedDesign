import java.util.Scanner;

/**
 * Write a description of class VendingMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachine
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    private int money;
    private String[] items;
    private int[] price;
    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine(int money)
    {
        money=money;
    }
    
    public void enterItems()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("How many items?: ");
        int num=in.nextInt();
        items=new String[num];
        price=new int[num];
        for(int i=0;i<items.length;i++)
        {
            System.out.print("Enter item: ");
            String name=in.next();
            items[i]=name;
            System.out.print("Enter price: ");
            int p=in.nextInt();
            price[i]=p;
        }
    }
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void buyProduct()
    {
        Scanner in=new Scanner(System.in);
        int total=0;
        String again="y";
        for(int i=0;i<items.length;i++)
        {
            System.out.println(i+1+". Product: "+items[i]+" Price: "+price[i]);
        }
        while(again.equals("y"))
        {
            System.out.print("Choose number of item to buy: ");
            int num=in.nextInt();
            System.out.print("Would you like to buy another item?(y or n): ");
            again=in.next();
                if(num>items.length)
            {
                System.out.println("ERROR: ITEM NOT IN LIST");
            }
            else
            {
                money-=price[num-1];
            }
        }
    }
}
