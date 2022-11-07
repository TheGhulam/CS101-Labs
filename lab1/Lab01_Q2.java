/*
 * This program calculates and prints some arithmetic expressions 
 * 
 * @author Ghulam Ahmed 
 */

public class Lab01_Q2 {
    public static void main(String args[]){
		
		// Calculations
        double expression_1 = (32.2 - 1.7 / 2.2)/((1.5 - 7.3) * (4.3 + 2.4));
        double expression_2 = (73.5 * 16.4 - Math.pow(3,6)) / (34 + Math.pow(2,5));
        double expression_3 = Math.pow((1.2 + 0.8), -1/3.0);
		
		// Display results
        System.out.println("Result of expression 1 is: " + expression_1);
        System.out.println("Result of expression 2 is: " + expression_2);
        System.out.println("Result of expression 3 is: " + expression_3);
    }
    
}
