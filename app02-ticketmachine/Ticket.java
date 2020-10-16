import java.util.Date;

/**
 * This class will store information about a ticket
 * including the journey destination, price and the
 * date and time purchased
 *
 * @author Derek Peacock
 * @version 0.1 16/10/2020
 */
public class Ticket
{
    // Fields, Attribute or variables
    
    private String destination;
    
    // currecny in pence
    private int price;
    
    private Date datePurchased;

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String destination, int price)
    {
        this.destination = destination;
        this.price = price;
        datePurchased = new Date();
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public String getDestination()
    {
        return destination;
    }
    
    public void print()
    {
        System.out.println();
        System.out.print("Ticket to " + destination);
        System.out.print(" " + price + " pence ");
        System.out.print(datePurchased);
        System.out.println();
    }

}
