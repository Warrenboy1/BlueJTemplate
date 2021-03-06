import java.util.*;

/**
 * The Course Class represents the FinalGrade Students will receive from 4 different modules calculated together.
 *
 * @author Warren Frank-Danvers
 * @version 20th Oct 2020
 */
public class Course
{
    // String Name
    private String name;
    // String Code
    private String code;
    // Character FinalGrade
    private char finalGrade;
    // Int/Number FinalCredits
    private int finalCredits;
    // Int/Number Mark
    private int mark;
    // Int/Number FinalMark
    private int finalMark;
    //Arraylist for Class Module
    private ArrayList<Module> modules;

     /**
     * Constructor for objects of class Course for Name & Code.
     */
    public Course(String name, String code)
    {
        this.name = name;
        this.code = code;
        modules = new ArrayList<Module>();
    }
    
    /**
     * Method to add newModule from the class Module Arraylist.
     */
    public void addModule(Module newModule)
    {
        modules.add(newModule);
    }
    
    /**
     * Print Course name & Course code and run method within class Module printModule.
     */
    public void printCourse()
    {
        for (Module module : modules)
        {
            module.printModule();
        }
        System.out.println("Course name: " + name + ", Course code: " + code);
    }
    
    /**
     * Calculate finalCredits (starting from 0). 
     */
    public void calculateCredits()
    {
        finalCredits = 0;
        for (Module module : modules)
        {
            finalCredits = finalCredits + module.getCredits();
        }
        System.out.println("Final Credits: " + finalCredits);
    }
    
    /**
     * Calculate finalGrade using information from class Module. make sure to use get method finalgrade for results returned
     */
    public void calculateFinalGrade()
    {
        finalMark = 0;
        mark = 0;
         for (Module module : modules)
        {
            mark = mark + module.getMark();
        }
        finalMark = mark / 4;
        if (finalMark >= 0 && finalMark <=39)
            {
                finalGrade = 'F';
            }
            else if (finalMark > 39 && finalMark <=49)
            {
                finalGrade = 'D';
            }
            else if (finalMark > 49 && finalMark <=59)
            {
                finalGrade = 'C';
            }
            else if (finalMark > 59 && finalMark <=69)
            {
                finalGrade = 'B';
            }
            else if (finalMark > 69 && finalMark <=100)
            {
                finalGrade = 'A';
            }
    }
    
    /**
     * return finalgrade as a character.
     */
    public char getFinalGrade()
    {
        return finalGrade;
    }

}
