import java.util.Scanner;

public class Lab02_Q1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        //Input
        System.out.print("Enter the width of the rectangle: ");
        double width = in.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        double height = in.nextDouble();
        in.close();

        //Calculations
        double area = width * height;
        double circumference = 2 * width + 2 * height;
        double diagonal = Math.sqrt(width * width + height * height);

        //Output
        System.out.printf("The area of the rectangle is%14s%15.3f%n" ,":", area);
        System.out.printf("The circumference of the rectangle is%5s%15.3f%n" ,":", circumference);
        System.out.printf("The diagonal of the rectangle is%10s%15.3f%n" ,":", diagonal);

        System.out.println("");
        System.out.printf("%-50s%10s%10.3f%n", "The area of the rectangle is", ":", area);
        System.out.printf("%-50s%10s%10.3f%n", "The circumference of the rectangle is", ":", circumference);
        System.out.printf("%-50s%10s%10.3f%n", "The diagonal of the rectangle is", ":", diagonal);
        System.out.printf("%-15s%10s%10s%n", "----------|", ":", "|------");
        System.out.printf("%-15s%-10s%10s%n", "----------|", ":", "|------");
        System.out.printf("%-15s%10s%-10s%n", "----------|", ":", "|------");
        System.out.printf("%15s%-10s%10s%n", "----------|", ":", "|------");
    }
}
