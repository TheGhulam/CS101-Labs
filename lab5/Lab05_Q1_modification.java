package lab5;

import java.util.Scanner;

public class Lab05_Q1_modification {
    public static void main(String args[]){
        // Input
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter city plan string: ");
        String input = in.nextLine();
        in.close();

        //Output
        for (int i = 9; i > 0; i--){
            for (int j = 0; j < input.length(); j ++){
                char c = input.charAt(j);
                if (Character.isLetter(c)){
                    char c_next = input.charAt(j+1);
                    if (c_next >= (i + '0')){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else{
                    // if (c >= (char)(i + 48)){
                    if (c >= (i + '0')){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
