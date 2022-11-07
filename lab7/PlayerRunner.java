package lab7;

public class PlayerRunner {
    public static void main(String args[]){
        String name, position, team;
        int rosterNumber;


        Player player1 = new Player("LeBron James", "PF", "CLE", 23);
        player1.setRosterNumber(6);
        player1.transfer("LAL");
        player1.setPosition("SF");
        // System.out.println(player1);

        Player player2 = new Player("Ron Artest", "SF", "LAL", 37);
        player2.setName("Metta World Peace");
        player2.retire();
        // System.out.println(player2);

        Player player3 = new Player("Stephen Curry", "SG", "GSW", 30);
        // System.out.println(player3);

        System.out.println(player1.isBeforeThan(player3));

        player1.recordGame(30, 10, 4, 4);
        player1.recordGame(15, 8, 7, 2);
        player1.recordGame(26, 8, 3, 7);
        player1.recordGame(19, 6, 6, 3);
        player1.recordGame(25, 5, 2, 5);
        player1.recordGame(34, 5, 11, 4);

        // System.out.println(player1);

        name = "Kevin Durant";
        position = "PF";
        team = "BKN";
        rosterNumber = 7;
        Player comparedPlayer = new Player(name, position, team, rosterNumber);
        comparedPlayer.recordGame(32, 4, 11, 1);
        comparedPlayer.recordGame(29, 12, 15, 2);
        comparedPlayer.recordGame(38, 3, 5, 2);
        comparedPlayer.recordGame(25, 4, 8, 1);
        comparedPlayer.recordGame(25, 2, 11, 5);
        // System.out.println(player1.toString());

        // System.out.println(comparedPlayer);

        System.out.println(player1.isMoreEfficient(player3));

    }
}
