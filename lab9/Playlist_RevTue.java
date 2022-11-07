package lab9;
    

import java.util.ArrayList;
import java.util.Collections;

public class Playlist_RevTue implements Comparable<Playlist_RevTue>{
    private String name;
    private String creator;
    private String genre;
    private ArrayList<Song> songs;

    public Playlist_RevTue(){
        this.name = "";
        this.creator = "";
        this.genre = "";
        this.songs = new ArrayList<Song>();
    }

    public Playlist_RevTue(String n, String c, String g, ArrayList<Song> s){
        setName(n);
        setCreator(c);
        setGenre(g);
        setSongs(s);
    }

    public void setName(String n){
        name = n;
    }
    
    public void setCreator(String c){
        creator = c;
    }
    
    public void setGenre(String g){
        genre = g;
    }
    
    public void setSongs(ArrayList<Song> s){
        songs = s;
    }

    public String getName(){
        return name;
    }
    
    public String getCreator(){
        return creator;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public ArrayList<Song> getSongs(){
        return songs;
    }

    // Playlist methods
    public boolean songExists(Song x){
        return songs.contains(x);
    }

    public void addSong(Song x){
        if (songs.size() > 0){
            if (!songs.contains(x)){
                songs.add(x);
            }
        }
        else{
            songs.add(x);
        }
    } 

    public void removeSong(Song x){
        if (songs.contains(x)){
            songs.remove(x);
        }
        // else{
        //     System.out.println("SONG NOT FOUND");
        // }
    }

    public void sortByDurationDesc(){
        Collections.sort(songs, Collections.reverseOrder());
    }

    public int compareTo(Playlist_RevTue x){
        if (this.songs.size() == x.getSongs().size()){
            return 0;
        }
        else if (this.songs.size() > x.getSongs().size()){
            return 1;
        }
        else{
            return -1;
        }
    }

    public String toString(){
        String result = "";
        // result += "****************************************\n";
        result += "-------------------------------------------------\n";
        result += "Playlist Name: " + getName() + "\n";
        result += "Creator Name: " + getCreator() + "\n";
        result += "Genre : " + getGenre() + "\n";
        result += "-------------------------------------------------\n";
        for (Song s : songs){
            result += s.toString();
            result += "-------------------------------------------------\n";
        }
        return result;
    }
}