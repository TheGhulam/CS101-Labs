package lab4;

import java.util.Scanner;

public class Lab04_Q2 {
    public static void main(String args[]){
        //Input
        Scanner in = new Scanner(System.in);
        System.out.print("Please input the string: ");
        String input = in.next();
        in.close();

        // Reverse the input string
        String reversed = "";
        int i = input.length() - 1;
        while (i >= 0){
            reversed += input.charAt(i);
            i--;
        }
        
        // Output
        if (reversed.equals(input)){
            System.out.println("It is a palindrome.");
        }
        else{
            System.out.println("It is not a palindrome.");
        }
    }
}
