package lab4;

import java.util.Scanner;

public class Lab04_Q3_modified {
    public static void main(String args[]){
        //Variables
        int maxSoFar = Integer.MIN_VALUE, minSoFar = Integer.MAX_VALUE, sum = 0, count = 0;

        //Input
        Scanner in = new Scanner(System.in);
        System.out.print("Please input a positive integer: ");
        int input = in.nextInt();

        while (input > 0){
            sum += input;
            if (input < minSoFar){
                minSoFar = input;
            }
            if (input > maxSoFar){
                maxSoFar = input;
            }
            System.out.print("Please input a positive integer: ");
            input = in.nextInt();
            count++;
        }

        // Output
        System.out.println("Min: " + minSoFar);
        System.out.println("Max: " + maxSoFar);
        System.out.println("Average: " +(float) sum / count);

        //Cleanup
        in.close();
    }
}
