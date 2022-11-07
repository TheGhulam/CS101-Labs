package lab5;

import java.util.Random;
import java.util.Scanner;


public class Lab05_Q2{
    public static void main(String args[]){
        // Variables
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        String deck = "", players_cards = "", dealers_cards = "";
        int player_sum = 0, dealer_sum = 0, choice = 1;

    
        // Deck initialization 
        System.out.println("Starting the game with the following deck:");
        for(int i = 1; i < 10; i++){
            for(int j = 0; j < 4; j++){
                deck += i;
            }
        }
        System.out.println(deck);

        //2
        System.out.println("Dealer is now dealing cards...");
        String rnd_chars = "";
        for(int i = 0; i < 4; i++){
            int rnd = rand.nextInt(deck.length());
            char rnd_char = deck.charAt(rnd);
            rnd_chars += rnd_char;
            deck = deck.substring(0, rnd) + deck.substring(rnd+1);
        }
        players_cards = rnd_chars.substring(0, 2);
        System.out.println("Player's hand:");
        System.out.println(players_cards);
        dealers_cards = rnd_chars.substring(2);
        System.out.println("Dealer's hand:");
        System.out.println(dealers_cards.substring(0,1) + "?");

        // 2.2

        do{
        System.out.println("Please enter your choice");
        System.out.println("1) Hit");
        System.out.println("2) Stand");
        choice = in.nextInt();
        if (choice == 1){
            System.out.println("Hit! Dealer is giving the player a card");
            int rnd = rand.nextInt(deck.length()); // Fix
            char rnd_char = deck.charAt(rnd);
            deck = deck.substring(0, rnd) + deck.substring(rnd+1);
            players_cards += rnd_char;
            System.out.println("Player's hand:");
            System.out.println(players_cards);

            player_sum = 0;
            for(int i = 0; i < players_cards.length(); i ++){
                player_sum += players_cards.charAt(i) - '0';
            }
        }
        // Now sum is >= 21

        else{
            player_sum = 0;
            for(int i = 0; i < players_cards.length(); i ++){
                player_sum += players_cards.charAt(i) - '0';
            }
            System.out.println("Stand! Player's turn is now over. Player's hand sums to " + player_sum);
        }
        }while (player_sum < 21 && choice == 1);

        if(player_sum == 21){
            System.out.println("Player scored 21. Player wins!");
        }
        else if(player_sum > 21){
            System.out.println("Player scored over 21. Player lost!");
        }
        else{
            System.out.println("Dealer is drawing cards");
            do{
                // System.out.println("Dealer's hand:");
                // System.out.println(dealers_cards);
                int rnd = rand.nextInt(deck.length()); // Some problem with upper index out of range: 28 (Fixed by removing +1 after deck.length())
                char rnd_char = deck.charAt(rnd);
                deck = deck.substring(0, rnd) + deck.substring(rnd+1);
                dealers_cards += rnd_char;
                System.out.println("Dealer's hand:");
                System.out.println(dealers_cards);

                dealer_sum = 0;
                for(int i = 0; i < dealers_cards.length(); i ++){
                    dealer_sum += dealers_cards.charAt(i) - '0';
                }
                }while(player_sum > dealer_sum);
            if(dealer_sum > 21){
                System.out.println("Dealer scored over 21. Dealer lost!");
            }
            else if(dealer_sum  == 21){
                System.out.println("Dealer scored 21. Dealer wins!");
            }
            else{
                System.out.println("Dealer score more than player. Dealer wins!");
            }
        }
        in.close();
    }
}