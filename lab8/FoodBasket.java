package lab8;
/*
* date: 26.11.2021
* v3.0
*/

public class FoodBasket {

    public static void main (String [] args){

        System.out.println("\n\t\t\t***\tWelcome to FoodBasket!\t***\t\t\t");

        // Foods
        Food food1 = new Food("Manti", 200); // Food(name, price)
        food1.setIngredients("flour, meat or veggies, salt, water");
        food1.setCalories(50);
        food1.setType("main course");

        Food food2 = new Food("Ezogelin Soup", "red lentils", 187, "soup", 20); // Food(name, ingredients, calories, type, price)
        Food food3 = new Food("Cheesecake", "sugar, cream cheese, eggs", 500, "dessert", 60);
        Food food4 = new Food("Cheesecake", "sugar, cream cheese, eggs", 400, "dessert", 50);
        Food food5 = new Food("Menemen", "eggs, tomatoes, onions", 100, "starter", 30);

        // Users
        User u1, u2, u3, u4;
        u1 = new User("Tarkan", 49);  // User(name, age)
        u2 = new User("Ajda Pekkan", 75);
        u3 = new User("Vedat Milor", 66);
        u4 = u3;
        
        // Orders
        Order order1 = new Order(1, "Pizza", 50);  // Order(portion, orderedFood)
        Order order2 = new Order(4, food1);
        Order order3 = new Order(1, "Doner", 60);
        Order order4 = new Order(4, "Iskender", 70);

        // -----------------------------------------------------------------------------------------------------------------------
        // User tests
        System.out.println("\n--------User Tests--------");
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);

        // comparing User objects using default.equals() method
        System.out.println("u1.equals( u2 ) is " + u1.equals(u2));
        System.out.println("u1.equals( u3 ) is " + u1.equals(u3));
        System.out.println("u3.equals( u4 ) is " + u3.equals(u4));

        // Food tests 
        System.out.println("\n--------Food Tests--------");
        
        System.out.println("( food3 == food4 ) is " + (food3 == food4)); // comparing Food objects using == operator
        System.out.println("food3.equals( food4 ) is " + food3.equals(food4) + "\n"); // comparing Food objects using
                                                                               // default.equals() method

        System.out.println(food1);
        System.out.println("Does " + food1.getName() + " contain salt? " + food1.doesContain("salt") + "\n");

        System.out.println(food2);
        food2.addNewIngredients("bulgur");
        System.out.println("Updated ingredient list of " + food2.getName() + ": " + food2.getIngredients());

        // Order tests
        System.out.println("\n--Order Tests--");
        System.out.print(order1);
        System.out.print(order2);

        order1.increasePortion(2);
        order1.checkout();
        order2.checkout();
        System.out.println("After checkouts...");
        System.out.print(order2);
        System.out.print("Order " + order1.getID() + " now has " + order1.getPortion() + " portion(s).\n"); 

        // THE CODE ABOVE SHOULD PRODUCE RESULTS SIMILAR TO THE FOLLOWING OUTPUT:
        /*
        
                        ***     Welcome to FoodBasket!  ***

            --------User Tests--------
            User ID: 0, User Name: Tarkan, Age: 49
            User ID: 1, User Name: Ajda Pekkan, Age: 75
            User ID: 2, User Name: Vedat Milor, Age: 66
            u1.equals( u2 ) is false
            u1.equals( u3 ) is false
            u3.equals( u4 ) is true

            --------Food Tests--------
            ( food3 == food4 ) is false
            food3.equals( food4 ) is true

            Manti is a main course dish. 
            It includes flour, meat or veggies, salt, water.
            Single portion contains 50 calories.
            Single serving cost = 200.0

            Does Manti contain salt? true

            Ezogelin Soup is a soup dish. 
            It includes red lentils.
            Single portion contains 187 calories.
            Single serving cost = 20.0

            Updated ingredient list of Ezogelin Soup: red lentils, bulgur

            --Order Tests--
            >> Warning: This order is incomplete.
            Details for Order 0:
                    Pizza(x 1.0)
                    TOTAL = 0.0

            >> Warning: This order is incomplete.
            Details for Order 1:
                    Manti(x 4.0)
                    TOTAL = 0.0

            After checkouts...
            Details for Order 1:
                    Manti(x 4.0)
                    TOTAL = 800.0

            Order 0 now has 3.0 portion(s).
        
        */

    }

}
