import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * This class is to show and feed the price of the individual station names
 * to TicketMachine.
 * @author Warren
 * @version 08/10/2020
 */
public class Ticket 
{
   
  
   public String destination;
   
   public static final int Aylesbury = 220;
   public static final int Amersham = 300;
   public static final int HighWycombe = 330;

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
