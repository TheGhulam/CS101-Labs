/*
 * This program calculates and prints some statistics about the World and Turkey
 * specifically.
 * 
 * @author Ghulam Ahmed
 */


public class Lab01_Q3{
    public static void main(String args[]){

        // Data
        long AREA_OF_THE_WORLD = 510072000;
        double WORLD_WATER_COVERAGE = .708;
        double WORLD_LAND_COVERAGE = 1 - .708;
        //double AREA_OF_TURKEY =  0.001536 * AREA_OF_THE_WORLD;
        //double WATER_OF_TURKEY = 0.013 * AREA_OF_TURKEY;
        //double LAND_OF_TURKEY = (1-0.013) * AREA_OF_TURKEY;
        long AREA_OF_GREECE = 131957;
        double GREECE_PERCENTAGE_OF_WATER = .0151;
        double GREECE_PERCENTAGE_OF_LAND = 1 - .0151;

        // Display the information
        System.out.printf("Earth has %.0f km2 dry land and %.0f km2 water.%n", AREA_OF_THE_WORLD * WORLD_LAND_COVERAGE, AREA_OF_THE_WORLD * WORLD_WATER_COVERAGE);
        System.out.printf("Greece has %.0f km2 dry land and %.0f km2 water.%n", AREA_OF_GREECE * GREECE_PERCENTAGE_OF_LAND, AREA_OF_GREECE * GREECE_PERCENTAGE_OF_WATER); 
        System.out.printf("Greece has %.15f percent of the Earth's dry land.%n", (AREA_OF_GREECE * GREECE_PERCENTAGE_OF_LAND/(AREA_OF_THE_WORLD * WORLD_LAND_COVERAGE)) * 100);
        System.out.printf("Greece has %.15f percent of the Earth's water.", (AREA_OF_GREECE * GREECE_PERCENTAGE_OF_WATER/(AREA_OF_THE_WORLD * WORLD_WATER_COVERAGE)) * 100);
    }

}