package lab4;

import java.util.Scanner;

public class Lab04_Q4 {
    public static void main(String args[]){
        System.out.print("Enter number of lines: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        int i = 1;
        while (i < n + 1){
            int j = 0;
            while (j < i){
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        }
        System.out.println("--------------------------");
        i = 0;
        while (i <= n){
            // Spaces
            int j = 2 *  (n - i);
            while (j > 0){
                System.out.print(" ");
                j--;
            }
            // Stars
            j = 0;
            while (j < 2 * i - 1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    } 
}
