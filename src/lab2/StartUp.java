/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *Using an interface here as opposed to an abstract class is unnecessary. Because 
 * all the subclasses share many common properties, all those 
 * properties could be stored in an abstract superclass, which would cut down
 * on some of the repetition across classes. The risks of inheriting bad code are small
 * in a situation like this, where the general function of each subclass is generally
 * the same, with only its properties varying. 
 * 
 * 
 * @author Jenna
 */
public class StartUp {
    public static void main(String[] args) {
        ProgrammingCourse advjava = new AdvancedJavaCourse("Adv. Java 1", "36578");
        ProgrammingCourse introjava = new IntroJavaCourse("Intro to Java 1", "56783");
        ProgrammingCourse introprog = new IntroToProgrammingCourse("Intro", "12353");
        
        introprog.setCourseNumber("4524");
        
        System.out.println(introprog.getCourseNumber());
        
        ProgrammingCourse[] arrayOfCourses = {
            advjava, introjava
        };
        
        for (ProgrammingCourse p : arrayOfCourses) {
            System.out.println(p);
        }
                
        
    }
    
}
