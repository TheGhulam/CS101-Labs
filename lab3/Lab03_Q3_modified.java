import java.util.Scanner;

public class Lab03_Q3_modified{
    public static void main(String args[]){

        // Variable intializations
        String pin = "1234";
        double balance = 1000;
        Scanner in = new Scanner(System.in);
        boolean validUser = false;

        // Ask for pin
        System.out.print("Enter your pin: ");
        String enteredPin = in.next();

        // Pin verification
        if (pin.equals(enteredPin)){
            validUser = true;
        }
        else{
            System.out.println("Invalid PIN! Bye!");
        }

        // 
        if (validUser){
            System.out.println("1- Withdraw money");
            System.out.println("2- Deposit money");
            System.out.println("3- Open a new account");
            System.out.println("4- Change PIN");
            System.out.print("Select an operation: ");
            short operation = in.nextShort();

            if (operation == 1){
                System.out.print("Enter the amount to withthdraw: ");
                double withdrawAmount = in.nextDouble();
                double newbalance = balance - withdrawAmount;
                if ((withdrawAmount <= 0) || (newbalance < 0)) {
                    System.out.println("You entered an invalid amount! Bye!");
                }
                else {
                System.out.printf("Your new balance is  %.2f TRY. Bye!", newbalance);
                }
            }
            if (operation == 2){
                System.out.print("Enter the amount to deposit: ");
                double depositAmount = in.nextDouble();
                if (depositAmount <= 0) {
                    System.out.println("You entered an invalid amount! Bye!");
                }
                else {
                System.out.printf("Your new balance is  %.2f TRY. Bye!", balance + depositAmount);
                }
            }
            if (operation == 3){
                System.out.println("1- TRY");
                System.out.println("2- USD");
                System.out.print("Select currency type: ");
                short currencyType = in.nextShort();

                if (currencyType == 1){
                    System.out.println("Your new TRY account is now opened! Bye!");
                }
                if (currencyType == 2){
                    System.out.println("Your new USD account is now opened! Bye!");
                }
            }
            if (operation == 4){
                System.out.print("Enter your new pin: ");
                String newPin = in.next();
                pin = newPin;
                System.out.printf("Your pin is changed to %c**%c. Bye!", pin.charAt(0), pin.charAt(3));
            }
        in.close();
        }
    }
}