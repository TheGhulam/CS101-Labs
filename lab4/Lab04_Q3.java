package lab4;

import java.util.Scanner;

public class Lab04_Q3 {
    public static void main(String args[]){
        //Variables
        int maxSoFar = Integer.MIN_VALUE, minSoFar = Integer.MAX_VALUE, sum = 0;

        //Input
        Scanner in = new Scanner(System.in);
        System.out.print("Please input n: ");
        int n = in.nextInt();

        System.out.println("Now input " + n + " positive integers");
        int i = 0;
        while (i < n){
            int input = in.nextInt();
            sum += input;
            if (input < minSoFar){
                minSoFar = input;
            }
            if (input > maxSoFar){
                maxSoFar = input;
            }
            i++;
        }

        // Output
        System.out.println("Min: " + minSoFar);
        System.out.println("Max: " + maxSoFar);
        System.out.println("Average: " +(float) sum / n);

        //Cleanup
        in.close();
    }
}
