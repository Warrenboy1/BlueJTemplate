import java.util.*;

/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String name;
    private String code;
    private char finalGrade;
    private int finalCredits;
    private int mark;
    private int finalMark;
    
    private ArrayList<Module> modules;

    /**
     * Constructor for objects of class Course
     */
    public Course(String name, String code)
    {
        // initialise instance variables
        this.name = name;
        this.code = code;
        modules = new ArrayList<Module>();
    }
    
    public void addModule(Module newModule)
    {
        modules.add(newModule);
    }
    
    public void printCourse()
    {
        System.out.println("Course name: " + name + ", Course code: " + code);
        for (Module module : modules)
        {
            module.printModule();
        }
    }
    
    public void calculateCredits()
    {
        finalCredits = 0;
        
        for (Module module : modules)
        {
            finalCredits = finalCredits + module.getCredits();
        }
        System.out.println("Final Credits: " + finalCredits);
    }
    
    public void calculateFinalGrade()
    {
        finalMark = 0;
        mark = 0;
        for (Module module : modules)
        {
            mark = mark + module.getMark();
            finalMark = mark / 4;
            if (finalMark > 0 && finalMark <=39)
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
    }
    
    public char getFinalGrade()
    {
        return finalGrade;
    }

    
    
    
}
