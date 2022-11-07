package lab4;

import java.util.Scanner;

public class Lab04_Q1 {

    // Recursion method
    // public static int fibonacci(int num){
    //     if (num <= 1){
    //         return num;
    //     }
    //     else{
    //         return fibonacci(num-1) + fibonacci(num - 2);
    //     }
    // }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        //Variables
        System.out.print("Please input n: ");
        int n = in.nextInt();
        in.close();
        int previous1 = 1, previous2 = 0, fib = 0;

        // Calculation
        if (n <= 1){
            fib = n;
        }
        int i = 0;
        while (i < n - 1){
            fib = previous1 + previous2;
            previous2 = previous1;
            previous1 = fib;
            i ++;
        }

        // Output
        System.out.printf("Fib(%d) is %d", n, fib);
        System.out.println();
        // System.out.println("fib(10)"+ fibonacci(10));
    }
    
}
