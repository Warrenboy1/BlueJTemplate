
/**
 * Write a description of class Course here.
 *
 * @author Warren Frank-Danvers
 * @version 01/11/2020
 */
public class Course
{
    private String codeNumber;
    private String title;
    
    private int capacity;
    
    
    /**
     * Create a new Course with a given title and codenumber.
     */
    public Course (String title, String codeNumber)
    {
        codeNumber = "G400";
        title = "unknown";
        
    }
    
    
    /**
     * include max number of courses allowed within the course.
     */
    public Course (int maxNumberOfCourses)
    {
        
        capacity = maxNumberOfCourses;
    }

    /**
     * Change title of course to replacementTitle.
     */
    public void changeTitle(String replacementTitle)
    {
        title = replacementTitle;
    }
    
    
}
