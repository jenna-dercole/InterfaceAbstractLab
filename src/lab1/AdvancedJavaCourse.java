package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 * This class has the responsibility of 
 *
 *
 * @author      Jenna
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse {
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }
    
    @Override
    public String getCourseName() {
        return courseName;
    }
    
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }
    
    @Override
    public final void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    
    @Override
    public double getCredits() {
        return credits;
    }

    public final String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
    public final void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits ;
    }
   
    
}
