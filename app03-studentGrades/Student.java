import java.util.*;

/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Warren Frank-Danvers
 * @version 20th Oct 2020
 */
public class Student
{
    // the student's full name
    private String name;
    // the student ID
    private String id;
    // the amount of credits for study taken so far
    private int credits;
    
    
    // create a link to class Course so class Student uses information from Course
    private Course course;
    
    /**
     * Create a new student with a given FullName and  student ID number.
     */
    public Student(String fullName, String studentID)
    {
        name = fullName;
        id = studentID;
        credits = 0;
        
    }
    
    /**
     * Add a new course for this student
     */
    public void enrollCourse(Course newCourse)
    {
        course = newCourse;
    }
    
     /**
     * Return the full name of this student.
     */
    public String getFullName()
    {
        return name;
    }

    /**
     * Set a new name for this student.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    /**
     * Return the student ID of this student.
     */
    public String getStudentID()
    {
        return id;
    }
    
    /**
     * Return the number of credit points this student has accumulated.
     */
    public int getCredits()
    {
        return credits;
    }
    
    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(name + ", student ID: " + id + ", credits: " + credits);
    }
    
    /**
     * Print the student's final grade to the output terminal.
     */
    public void printFinalGrade()
    {
        System.out.println("The final grade is: " + course.getFinalGrade());
        course.printCourse();
    }
    
}
