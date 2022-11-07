import java.util.Scanner;

public class Lab03_Q2 {
    public static void main(String args[]){
        // Input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year to be evaluated: ");
        int year = in.nextInt();
        in.close();

        // Century decision
        int century = (int) (Math.ceil(year / 100.0));

        // Switch 
        // String centuryOrdinal;
        // switch (century){
        //     case 1: centuryOrdinal = "1st"; break;
        //     case 2: centuryOrdinal = "2nd"; break;
        //     case 3: centuryOrdinal = "3rd"; break;
        //     case 21: centuryOrdinal = "21st"; break;
        //     case 22: centuryOrdinal = "22st"; break;
        //     default: centuryOrdinal = String.valueOf(century) + "th"; break;
        // }

        // If else
        String centuryOrdinal;
        if (century == 1){
            centuryOrdinal = "1st";
        }
        else if (century == 2){
            centuryOrdinal = "2nd";
        }
        else if (century == 3){
            centuryOrdinal = "3rd";
        }
        else if (century == 21){
            centuryOrdinal = "21st";
        }
        else if (century == 22){
            centuryOrdinal = "22nd";
        }
        else {
            centuryOrdinal = String.valueOf(century) + "th";
        }

        // Leap year decision
        boolean leapYear = false;
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    leapYear = true;
                }
            }
            else{
                leapYear = true;
            }
        }

        // Output
        if (leapYear){
            System.out.printf("The year %d is in the %s century and is a leap year.", year, centuryOrdinal);
        }
        else{
            System.out.printf("The year %d is in the %s century and is not a leap year.", year, centuryOrdinal);
        }
    }
}
