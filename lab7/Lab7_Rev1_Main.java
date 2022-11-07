package lab7;

public class Lab7_Rev1_Main {
    public static void main(String[] args) {
        Team team = new Team("Seattle Supersonics", "SEA", "Sonics Arena", "Seattle");
        String name = "Kevin Durant";
        String position = "PF";
        int rosterNumber = 7;
        Player_Rev1 player = new Player_Rev1(name, position, team, rosterNumber);
        team.changeOwnership("Oklahoma City Thunder", "OKC", "Oklahoma");
        System.out.println(player.getTeam());
        /*
        ****************************************
        Team name: Oklahoma City Thunder
        Abbreviation: OKC
        Number of players: 1
        Stadium name: Sonics Arena
        City: Oklahoma
        ****************************************
        */
        System.out.println(player);
        /*
        **************************************************
        Player ID: 1
        Player Name: Kevin Durant
        Player Position: PF
        Current Team: Oklahoma City Thunder
        Jersey Number: 7
        --------------------------------------------------
        Stats:
        PPG: 0.00
        APG: 0.00
        RPG: 0.00
        TPG: 0.00
        Efficiency: 0.00
        --------------------------------------------------
        Retirement Status: Active among 1 active player(s)
        **************************************************
        */

        team.changeStadium("Chesapeake Energy Arena");
        System.out.println(player.getTeam());
        /*
        ****************************************
        Team name: Oklahoma City Thunder
        Abbreviation: OKC
        Number of players: 1
        Stadium name: Chesapeake Energy Arena
        City: Oklahoma
        ****************************************
        */

        Team newTeam = new Team("Brooklyn Nets", "BKN", "Barclays Center", "Brooklyn");
        player.transfer(newTeam);

        System.out.println("After transferring the player");
        System.out.println(team);
        /*
        ****************************************
        Team name: Oklahoma City Thunder
        Abbreviation: OKC
        Number of players: 0
        Stadium name: Chesapeake Energy Arena
        City: Oklahoma
        ****************************************
        */

        System.out.println(player.getTeam());
        /*
        ****************************************
        Team name: Brooklyn Nets
        Abbreviation: BKN
        Number of players: 1
        Stadium name: Barclays Center
        City: Brooklyn
        ****************************************
        */

        System.out.println(player);
        /*
        **************************************************
        Player ID: 1
        Player Name: Kevin Durant
        Player Position: PF
        Current Team: Brooklyn Nets
        Jersey Number: 7
        --------------------------------------------------
        Stats:
        PPG: 0.00
        APG: 0.00
        RPG: 0.00
        TPG: 0.00
        Efficiency: 0.00
        --------------------------------------------------
        Retirement Status: Active among 1 active player(s)
        **************************************************
        */  
        Player_Rev1 player2 = new Player_Rev1("James Harden", "SG", newTeam, 13);
        System.out.println(player2.getTeam());
        /*
        ****************************************
        Team name: Brooklyn Nets
        Abbreviation: BKN
        Number of players: 2
        Stadium name: Barclays Center
        City: Brooklyn
        ****************************************
        */

        System.out.println(player2);
        /*
        **************************************************
        Player ID: 2
        Player Name: James Harden
        Player Position: SG
        Current Team: Brooklyn Nets
        Jersey Number: 13
        --------------------------------------------------
        Stats:
        PPG: 0.00
        APG: 0.00
        RPG: 0.00
        TPG: 0.00
        Efficiency: 0.00
        --------------------------------------------------
        Retirement Status: Active among 2 active player(s)
        **************************************************
        */
    }
}