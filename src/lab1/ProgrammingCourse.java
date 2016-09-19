
package lab1;

/**
 *
 * @author Jenna
 */
public abstract class ProgrammingCourse {
    protected String courseName;
    protected String courseNumber;
    protected double credits;

   public abstract String getCourseName();

   public abstract String getCourseNumber();
    
   public abstract double getCredits();

   public abstract void setCourseNumber(String courseNumber);
    
   public abstract void setCourseName(String courseName);
    
   public abstract void setCredits(double credits);

    @Override
    public String toString() {
        return "ProgrammingCourse{" + "courseName=" + courseName + ", courseNumber=" + courseNumber + ", credits=" + credits + '}';
    }
   
   
    
}
