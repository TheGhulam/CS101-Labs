package lab7;

import java.util.ArrayList;

public class Team {
    private String teamName, abbreviation, stadiumName, city;
    private static int playerCount;
    ArrayList<Player_Rev1> players = new ArrayList<Player_Rev1>();
    // private Player player;
    

    // Constructor
    public Team(String n, String a, String s, String c){
        this.teamName = n;
        this.abbreviation = a;
        this.stadiumName = s;
        this.city = c;
    }

    public String getTeamName(){
        return this.teamName;
    }

    public void transferPlayer(Player_Rev1 a){
        players.add(a);
        playerCount ++;
    }
    
    public void releasePlayer(Player_Rev1 a){
        playerCount --;
    }

    public void changeStadium(String s){
        this.stadiumName = s;
    }

    public void changeOwnership(String n, String a, String c){
        this.teamName = n;
        this.abbreviation = a;
        this.city = c;
    }

    public String toString(){
        System.out.println("***************************************");
        return "Team name: " + this.teamName + "\n" + 
        "Abbreviation: " + this.abbreviation + "\n" + 
        "Number of players: " + playerCount + "\n" + 
        "Stadium name: " + this.stadiumName + "\n" + 
        "City: " + this.city + "\n" + 
        "***************************************";
    }
    
}

