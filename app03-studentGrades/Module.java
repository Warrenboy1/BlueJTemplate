

/**
 * Write a description of class Module here.
 *
 * @author Warren Frank-Danvers
 * @version 20th Oct 2020
 */
public class Module
{
    // String name
   private String name;
    // String code
   private String code;
    // character finalGrade
   private char finalGrade;
    // Integar credits
   private int credits = 0;
    // Integar mark
   private int mark;

   /**
     * Constructor for objects of class Module.
     */
   public Module(String name, String code)
   {
        // initialise instance variables
        this.name = name;
        this.code = code;
        
   }
    
   /**
     * Print Module Name, Module Code, Mark & percentage to output machine.
     */
   public void printModule()
   {
         System.out.println("Module Name: " + name + " , Module Code: " + code + " , Mark: " + mark + "%");
   }
    
   /**
     * Award/add mark onto Module.
     */
   public void awardMark(int mark)
   {
        this.mark = mark;
   }
    
   /**
    * calculate credits, if mark is above 39 then credits = 15. if not then credits = 0 (which is set by default).
    */
   public void calculateCredits()
   {
        if (mark > 39)
        {
            credits = 15;
        }
   }
     
   /**
    * return credits value as integar.
    */
   public int getCredits()
   {
        return credits;
   }
    
   /**
    * calculate final grade. if mark is over 0 and equal to or less than 100, then final grade should have a character either 'F,D,C,B,A'.
    */
   public void calculateFinalGrade()
   {
        if (mark > 0 && mark <=39)
        {
            finalGrade = 'F';
        }
        else if (mark > 39 && mark <=49)
        {
            finalGrade = 'D';
        }
        else if (mark > 49 && mark <=59)
        {
            finalGrade = 'C';
        }
        else if (mark > 59 && mark <=69)
        {
            finalGrade = 'B';
        }
        else if (mark > 69 && mark <=100)
        {
            finalGrade = 'A';
        }
        else 
        {
            System.out.println("Marks should be between 0-100");
        }
   }
    
   /**
    * return finalgrade as character.
    */
   public char getFinalGrade()
   {
        return finalGrade;
   }
    
   /**
    * return mark as integar.
    */
   public int getMark()
   {
        return mark;
   }
    
    
    
    
    

    
}
