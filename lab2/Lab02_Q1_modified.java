import java.util.Scanner;

public class Lab02_Q1_modified{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        //Input
        System.out.print("Enter the side of the octagon: ");
        double side = in.nextDouble();
        in.close();

        //Calculations
        double area = 2 * (1 + Math.sqrt(2)) * (side  * side); 
        double circumference = 8 * side;
        double diagonal = side * Math.sqrt(4 + (2 * Math.sqrt(2)));

        //Output
        System.out.printf("The area of the octagon is%14s%15.3f%n" ,":", area);
        System.out.printf("The circumference of the octagon is%5s%15.3f%n" ,":", circumference);
        System.out.printf("The diagonal of the octagon is%10s%15.3f" ,":", diagonal);
    }
}
