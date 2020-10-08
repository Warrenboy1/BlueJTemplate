/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by warren
 * date 08/10/2020
 */
public class TicketMachine extends Ticket
{
    /**
     * The price of a ticket from this machine was not used.
     */ 
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        price = 0;
        balance = 0;
        total = 0;
        
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     * WE ONLY ACCEPT 10p, 20p, £1 and £2.
     */
    public void insertMoney(int amount)
    {
        if(amount == 10) 
        {
            balance = balance + amount;
            System.out.println("Balance : " + balance);
        }
        else if(amount == 20) 
        {
            balance = balance + amount;
            System.out.println("Balance : " + balance);
        }
        else if(amount == 100) 
        {
            balance = balance + amount;
            System.out.println("Balance : " + balance);
        }
        else if(amount == 200) 
        {
            balance = balance + amount;
            System.out.println("Balance : " + balance);
        }
        else 
        {
            System.out.println("We only accept 10p, 20p, £1 or £2. Thank you.  Not: " +
                               amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicketAylesbury()
    {
        if(balance >= Aylesbury)
        {
            // Simulate the printing of a ticket.
            System.out.println("########NO########");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket Aylesbury");
            System.out.println("# " + Aylesbury + " cents.");
            System.out.println("######REFUNDS######");
            System.out.println();

            // Update the total collected with the price.
            total = total + Aylesbury;
            // Reduce the balance by the price (in this case "Aylesbury").
            balance = balance - Aylesbury;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (Aylesbury - balance) + " more cents.");
                    
        }
    }
    
    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicketAmersham()
    {
        if(balance >= Amersham)
        {
            // Simulate the printing of a ticket.
            System.out.println("########NO########");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket Amersham");
            System.out.println("# " + Amersham + " cents.");
            System.out.println("######REFUNDS######");
            System.out.println();

            // Update the total collected with the price.
            total = total + Amersham;
            // Reduce the balance by the price (in this case "Amersham").
            balance = balance - Amersham;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (Amersham - balance) + " more cents.");
                    
        }
    }
    
    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("########NO########");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket High Wycombe");
            System.out.println("# " + HighWycombe + " cents.");
            System.out.println("######REFUNDS######");
            System.out.println();

            // Update the total collected with the price.
            total = total + HighWycombe;
            // Reduce the balance by the price (in this case "High Wycombe").
            balance = balance - HighWycombe;
            
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (HighWycombe - balance) + " more cents.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
