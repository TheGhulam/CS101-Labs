package lab4;

import java.util.Scanner;

public class Lab04_Q4_modified {
    public static void main(String args[]){
        System.out.print("Enter number of lines: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        int i = 0;
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
