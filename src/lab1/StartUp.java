
package lab1;

/**The Liskov Substitution Principle is useful when inheritance plays a significant
 * role in what custom data types are able to do. In the instance here, where the subclasses
 * are basically doing the same thing as the abstract class, just with more specifically-
 * defined methods, the Liskov substitution principle is not as crucial as it would be
 * if the functions of the subclasses differed greatly than the superclass they inherited from.
 *
 * @author Jenna
 */
public class StartUp {
    public static void main(String[] args) {
        ProgrammingCourse ajc = new AdvancedJavaCourse("Advanced Java", "23432");
        ProgrammingCourse ijc = new IntroJavaCourse("Intro to Java", "23456");
        ProgrammingCourse itpc = new IntroToProgrammingCourse("Programming Intro", "10156");
        
        System.out.println(ajc.getCourseName());
        System.out.println(ijc.getCourseName());
        System.out.println(itpc.getCourseName());
        
        ProgrammingCourse[] array = {
            ajc, ijc, itpc
        };
        
        for (ProgrammingCourse p : array) {
            System.out.println(p);
        }
        
        ijc.setCredits(3.5);
        System.out.println(ijc);
        
    }
}
