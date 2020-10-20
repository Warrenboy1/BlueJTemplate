

/**
 * Write a description of class Module here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Module
{
    // instance variables - replace the example below with your own
    private String name;
    private String code;
    private char finalGrade;
    private int credits = 0;
    private int mark;

    /**
     * Constructor for objects of class Module
     */
    public Module(String name, String code)
    {
        // initialise instance variables
        this.name = name;
        this.code = code;
        
    }
    
    public void printModule()
    {
         System.out.println("Module Name: " + name + " , Module Code: " + code + " , Mark: " + mark + "%");
    }
    
    public void awardMark(int mark)
    {
        this.mark = mark;
    }
    
    public void calculateCredits()
    {
        if (mark > 39)
        {
            credits = 15;
        }
    }
    
    public int getCredits()
    {
        return credits;
    }
    
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
    
    public char getFinalGrade()
    {
        return finalGrade;
    }
    
    public int getMark()
    {
        return mark;
    }
    
    
    
    
    

    
}
