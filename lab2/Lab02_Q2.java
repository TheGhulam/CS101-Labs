import java.util.Scanner;

public class Lab02_Q2 {
    public static void main(String args[]){
        // Input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the odometer reading of the car in kilometers: ");
        long mileage = in.nextInt();
        in.close();

        // Declarations
        final double OIL_CHANGE_P = 0.3;
        final double BATTERY_P = 0.15;
        final double BRAKES_P = 0.25;
        final double TIRES_P = 0.13;
        final double OTHER_P = 0.17;
        final double MAINTENANCE_P = 0.1;

        double totalMaintenanceCost = mileage * MAINTENANCE_P;

        //Save the output format into a container for ease
        String leftAlignFormat = "*%-20s %%%-9.0f %10.2f     *%n";

        // Output
        System.out.format("*************************************************%n");
        System.out.format("*****  Maintenance Cost Distribution Table  *****%n");
        System.out.format("*************************************************%n");
        System.out.printf(leftAlignFormat, "Oil change", OIL_CHANGE_P*100,  totalMaintenanceCost * OIL_CHANGE_P);
        System.out.printf(leftAlignFormat, "Battery", BATTERY_P*100,  totalMaintenanceCost * BATTERY_P);
        System.out.printf(leftAlignFormat, "Brakes", BRAKES_P*100,  totalMaintenanceCost * BRAKES_P);
        System.out.printf(leftAlignFormat, "Tire", TIRES_P*100,  totalMaintenanceCost * TIRES_P);
        System.out.printf(leftAlignFormat, "Other", OTHER_P*100,  totalMaintenanceCost * OTHER_P);
        System.out.printf("*%26s %15.2f     *%n", "Total",  totalMaintenanceCost);
        System.out.format("*************************************************%n");
    }
    
}
