package lab5;

import java.util.Scanner;

public class Lab05_Q1 {
    public static void main(String args[]){
        // Input
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter city plan string: ");
        String input = in.nextLine();
        in.close();

        // Get max height of building
        int max = Character.getNumericValue(input.charAt(0));
        for (int i = 1; i < input.length(); i++) {
            int compare = Character.getNumericValue(input.charAt(i));
            if (max < compare) {
                max = compare;
            }
        }

        //Output
        for (int i = max; i > 0; i--){
            for (int j = 0; j < input.length(); j ++){
                char c = input.charAt(j);
                // if (c >= (char)(i + 48)){
                if (c >= (i + '0')){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
