import java.util.Scanner;

public class Lab03_Q1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        // Input
        System.out.print("Enter your weight in kilograms: ");
        double weight = in.nextDouble();
        System.out.print("Enter your height in metres: ");
        double height = in.nextDouble();
        in.close();

        // Calculation
        double bmi = weight / (height * height);

        // Output
        if (bmi < 18.5){
            System.out.printf("Your BMI is %.2f and you are in the category of underweight.", bmi);
        }
        else if (bmi < 25){
            System.out.printf("Your BMI is %.2f and you are in the category of healthy.", bmi);
        }
        else if (bmi < 30){
            System.out.printf("Your BMI is %.2f and you are in the category of overweight.", bmi);
        }
        else {
            System.out.printf("Your BMI is %.2f and you are in the category of obese.", bmi);
        }
    }
}
