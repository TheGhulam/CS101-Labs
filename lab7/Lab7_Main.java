package lab7;

public class Lab7_Main {

    static Player player1; // To use the player instance in all parts

    public static void part1Test() {
        // Player 1 details
        String name = "LeBron James";
        String position = "PF";
        String team = "CLE";
        int rosterNumber = 23;
        player1 = new Player(name, position, team, rosterNumber); // Used in other tests also
        player1.setRosterNumber(6);
        player1.transfer("LAL");
        player1.setPosition("guard"); // Expecting an error message
        player1.setPosition("SF");
        // Reusing generated Player class input holders
        name = "Ron Artest";
        position = "SF";
        team = "LAL";
        rosterNumber = 37;
        Player player2 = new Player(name, position, team, rosterNumber);
        player2.setName("Metta World Peace");
        player2.retire();
        name = "Stephen Curry";
        position = "SG";
        team = "GSW";
        rosterNumber = 30;
        Player player3 = new Player(name, position, team, rosterNumber);
        player3.transfer("GSW"); // An error message is expected
        // Comparing names of player1 and player3
        if (player1.isBeforeThan(player3)) {
            System.out.println("PASSED: Your result is correct");
        } else {
            System.out.println("FAILED: isBeforeThan implementation is incorrect");
        }

        // Printing player information
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);

    }

    public static void part2Test() {
        player1.recordGame(30, 10, 4, 4);
        player1.recordGame(15, 8, 7, 2);
        player1.recordGame(26, 8, 3, 7);
        player1.recordGame(19, 6, 6, 3);
        player1.recordGame(25, 5, 2, 5);
        player1.recordGame(34, 5, 11, 4);

        System.out.println(player1);
    }

    public static void part3Test() {
        String name = "Kevin Durant";
        String position = "PF";
        String team = "BKN";
        int rosterNumber = 7;
        Player comparedPlayer = new Player(name, position, team, rosterNumber);
        comparedPlayer.recordGame(32, 4, 11, 1);
        comparedPlayer.recordGame(29, 12, 15, 2);
        comparedPlayer.recordGame(38, 3, 5, 2);
        comparedPlayer.recordGame(25, 4, 8, 1);
        comparedPlayer.recordGame(25, 2, 11, 5);

        System.out.println(player1);
        System.out.println(comparedPlayer);

        System.out.println("Efficiency of " + player1.getName() + ": " + String.format("%.2f", player1.getEfficiency()));
        System.out.println("Efficiency of " + comparedPlayer.getName() + ": " + String.format("%.2f", comparedPlayer.getEfficiency()));

        if (player1.isMoreEfficient(comparedPlayer)) {
            System.out.println(player1.getName() + " wins MEP award!");
        } else {
            System.out.println(comparedPlayer.getName() + " wins MEP award!");
        }
    }
    public static void main(String[] args) {
        System.out.println("TESTING PART 1");
        part1Test();
        System.out.println("TESTING PART 2");
        part2Test();
        System.out.println("TESTING PART 3");
        part3Test();

    }
}
