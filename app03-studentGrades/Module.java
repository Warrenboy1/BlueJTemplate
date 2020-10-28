

/**
 * This Class is to create different modules for the course class and calculate marks and award credits to students who have passed and recieve a finalgrade for their module
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
    * return credits value as integar. if mark is above 39 then credits = 15. if not then credits = 0.
    */
   public int getCredits()
   {
       if (mark > 39)
       {
           credits = 15;
       }
       else
       {
           credits = 0; 
       }
       return credits;
   }
    
   /**
    * return final grade as character. if mark is over 0 and equal to or less than 100, then final grade should have a character either 'F,D,C,B,A'.
    */
   public char calculateFinalGrade()
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
