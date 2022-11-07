/*
 * This program prints information about the lab schedule and grading policy.
 * It has certain syntax errors that are to be fixed by the student.
 * 
 * @author Ugur Dogrusoz
 */
public class Lab01_Q1{
   public static void main( String args[]){ 
      // Constants
      final double LABS_GRADE_PERCENT = 25;  // grading policy
      final int LABS_COUNT = 10;  
      final double GRADE_PERCENT_PER_LAB = LABS_GRADE_PERCENT / LABS_COUNT;
      
      // Variables
      String courseAndSemester;     
      
      /* This program prints information about the labs
         and grading policy */
           
      // First initialize the course & semester information
      courseAndSemester = "CS101 Fall 2021";
      
      // Then print out welcome message for this course, semester and lab
      System.out.println( "Hi everyone, below are some details about lab grades" );
      System.out.println( "Welcome to " + courseAndSemester + " Lab 01" );
      System.out.println();
      
      // Now print out the grading policy
      System.out.println( "There are "+ LABS_COUNT + " lab sessions in this course." );
      System.out.println( "Labs contribute to " + LABS_GRADE_PERCENT + "% of your total grade." );
      System.out.println( "This lab:\t" + GRADE_PERCENT_PER_LAB + "\tpoints" );
      System.out.println( "All labs:\t" + LABS_GRADE_PERCENT + "\tpoints" );
      System.out.println( "Please come prepared..." );
      
      // Finally wish them luck and finish
      System.out.println();
      System.out.println( "Good luck!" );      
   }
}