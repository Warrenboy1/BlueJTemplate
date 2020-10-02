
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
        codeNumber = "G400";
        title = "unknown";
        
    }
    
    
    public Course (int maxNumberOfCourses)
    {
        
        capacity = maxNumberOfCourses;
    }

    public void changeTitle(String replacementTitle)
    {
        title = replacementTitle;
    }
    
    
}
