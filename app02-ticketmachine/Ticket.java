
/**
 * Write a description of class Ticket here.
 *
 * @author Warren
 * @version 08/10/2020
 */
public class Ticket extends Coin 
{
   
   public int Aylesbury = 220;
   public int Amersham = 300;
   public int HighWycombe = 330;
   public String destination;

   /**
     * Ticket for Aylesbury including price.
     */
    public String Aylesbury()
    {
        String destination = "Aylesbury";
        System.out.println("£2.20");
        return "For A Ticket to Aylesbury, please put in £2.20";
    }
    
    /**
     * Ticket for Amersham including price.
     */
    public String Amersham()
    {
        String destination = "Amersham";
        System.out.println("£3.00");
        return "For a Ticket to Amersham, please put in £3.00";
    }
    
    /**
     * Ticket for High Wycombe including price.
     */
    public String HighWycombe()
    {
        String destination = "High Wycombe";
        System.out.println("£3.30");
        return "For a Ticket to High Wycombe, please put in £3.30";
    }
}
