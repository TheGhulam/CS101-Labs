package lab6;

import java.util.Scanner;

public class Lab06_Q1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to be examined: ");
        int input = in.nextInt();
        in.close();

        System.out.println("Number of digits: " + countDigits(input));
        System.out.println("Sum of digits: " + sumOfDigits(input));
        if (isFib(input)){
            System.out.println(input + " is a Fibonacci number.");
        }
        else{
            System.out.println(input + " is not a Fibonacci number.");
        }
        if (isHarshad(input)){
            System.out.println(input + " is a Harshad number.");
        }
        else{
            System.out.println(input + " is not a Harshad number.");
        }
        if (isNarcissistic(input)){
            System.out.println(input + " is Narcissistic");
        }
        else{
            System.out.println(input + " is not Narcissistic");
        }
        if (isPrime(input)){
            System.out.println(input + " is a Prime number.");
        }
        else{
            System.out.println(input + " is not a Prime number.");
        }

    }

    public static boolean isPerfectSquare(int n){
        if (n >= 0){
            int root = (int)Math.sqrt(n);
            return ((root * root) == n);
        }
        return false;
    }

    public static int sumOfDigits(int n){
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int power(int a, int b){
        int result = 1;
        for (int i = 0; i < b; i ++){
            result *= a;
        }
        return result;
    }

    public static int countDigits(int n){
        return Integer.toString(n).length();
    }

    public static boolean isFib(int n){
        return isPerfectSquare(5 * (n * n) + 4) || isPerfectSquare(5 * (n * n) - 4);
    }

    public static boolean isHarshad(int n){
        return ((n % sumOfDigits(n)) == 0);
    }

    public static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;

    }
    public static boolean isPrimeO(int n){
        if ((n == 2) || (n ==3) || (n == 5) || (n == 7)){
            return true;
        }
        if ((n < 2) || ((n % 2) == 0)){
            return false;
        }
        if (((n % 3) == 0) || ((n % 5 == 0))){
            return false;
        }
        int root = (int)Math.sqrt(n);
        int f = 5;
        while (f <= root){
            if (((n % f) == 0) || ((n % (f + 2) == 0))){
                return false;
            }
            f += 6;
        }
        return true;
    }

    public static boolean isNarcissistic(int n){
        String input = Integer.toString(n);
        int length = countDigits(n);
        int result = 0;
        for(int i = 0; i < length; i ++){
            int digit = (int)(input.charAt(i) - '0');
            result += power(digit, length);
        }
        return result == n;
    }
}