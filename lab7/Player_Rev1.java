package lab7;

import java.util.Arrays;

public class Player_Rev1 {

    //Fields/Class attributes
    private static int count = 0, allCount = 0;
    private int id, rosterNumber;
    private String name, position;
    private Team team;
    private boolean isActive = false;

    // 2
    private int gamesPlayed;
    private double pointsPerGame, assistsPerGame, reboundsPerGame, turnoversPerGame;
    private double ppgAvg, apgAvg, rpgAvg, tpgAvg;

    // Constructor
    public Player_Rev1(String name, String position, Team team, int rosterNumber){
        this.register(team);
        this.id = Player_Rev1.allCount;

        setName(name);
        setPosition(position);
        setTeam(team);
        setRosterNumber(rosterNumber);
        
    }

    //Accessor methods
    public String getName(){
        return this.name;
    }

    public int getID(){
        return this.id;
    }

    public String getPosition(){
        return this.position;
    }

    public String getTeam(){
        return this.team.toString();
    }

    public boolean getIsActive(){
        return this.isActive;
    }

    public int getRosterNumber(){
        return this.rosterNumber;
    }

    public double getEfficiency(){
        return ppgAvg + 0.7 * apgAvg + 0.7 * rpgAvg - 0.9 * tpgAvg;
    }

    //Setter methods
    public void setRosterNumber(int n){
        this.rosterNumber = n;
    }

    public void setName(String s){
        this.name = s;
    }

    public void setTeam(Team t){
        this.team = t;
    }

    public boolean validPosition(String s){
        String[] validnames = {"SF", "PF", "SG", "PG", "C"};
        // Checking if string in string array
        return Arrays.asList(validnames).contains(s);
    }

    public void setPosition(String s){
        if (validPosition(s)){
            this.position = s;
        }
        else {
            System.out.println("Invalid position");
        }
    }

    public void register(Team a){
        allCount += 1;
        count += 1;
        this.isActive = true;
        a.transferPlayer(this);
    }

    public void remove(){
        Player_Rev1.allCount -= 1;
    }

    public void retire(){
        Player_Rev1.count -= 1;
        this.isActive = false;
    }

    public void transfer(Team s){
        if (s == this.team){
            System.out.println("Trying to change to the same team");
        }
        else{
        this.team.releasePlayer(this);
        this.team = s;
        this.team.transferPlayer(this);
        }
    }

    // Service methods
    public boolean isBeforeThan(Player x){
        if ((this.name.compareTo(x.getName())) < 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void recordGame(int ppg, int apg, int rbg, int tpg){
        gamesPlayed += 1;
        this.pointsPerGame += ppg;
        this.assistsPerGame += apg;
        this.reboundsPerGame += rbg;
        this.turnoversPerGame += tpg;

        ppgAvg = pointsPerGame / (float) gamesPlayed;
        apgAvg = assistsPerGame / (float) gamesPlayed;
        rpgAvg = reboundsPerGame / (float) gamesPlayed;
        tpgAvg = turnoversPerGame / (float) gamesPlayed;
    }

    public boolean isMoreEfficient(Player a){
        return this.getEfficiency() < a.getEfficiency();

    }


    public String toString(){
        System.out.println("*************************************************");
        System.out.println("Player ID: " + getID());
        System.out.println("Player Name: " + getName());
        System.out.println("Player Position: " + getPosition());
        System.out.println("Current team: " + this.team.getTeamName());
        System.out.println("Jersey Number: " + getRosterNumber());
        System.out.println("---------------------------------------------------");
        System.out.println("Stats:");
        System.out.printf("PPG: %.2f%n", ppgAvg);
        System.out.printf("APG: %.2f%n", apgAvg);
        System.out.printf("RPG: %.2f%n", rpgAvg);
        System.out.printf("TPG: %.2f%n", tpgAvg);
        System.out.printf("Effeciency: %.2f%n", this.getEfficiency());
        System.out.println("---------------------------------------------------");
        if (this.isActive){
            return "Retirement Status: Active among "+ Player_Rev1.count + " active player(s)";
        }
        else{
            return "Retirement Status: Inactive among "+ Player_Rev1.count + " active player(s)";
        }
    }
}
