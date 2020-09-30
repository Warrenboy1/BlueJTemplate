
/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    private String codeNumber;
    private String title;
    
    private int capacity;
    
    
    public Course (String title, String codeNumber)
    {
        codeNumber = "unknown";
        title = "unknown";
        
        
    }
    
    
    public Course (int maxNumberOfCourses)
    {
        // initialise instance variables
        capacity = maxNumberOfCourses;
    }

    
    public void enrollCourse(Course newCourse)
    {
        
    }
}
