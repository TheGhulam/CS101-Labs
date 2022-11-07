package lab9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class MusicApp {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        // Variables
        ArrayList<String> genres = new ArrayList<String>(Arrays.asList("Country", "Electronic", "Pop Music", "Rock Music", "Jazz", "Classical"));
        ArrayList<Playlist> playlists = new ArrayList<Playlist>();

        System.out.println("--------------------------------------");
        System.out.println("Welcome to Music App! Get Ready to create your playlist!");
        System.out.println("--------------------------------------");

        System.out.println("1 - Create a new Playlist");
        System.out.println("2 - Display the Playlist");
        System.out.println("3 - Sort the Playlist");
        System.out.println("4 - Remove song by index from the current Playlist");
        System.out.println("5 - Display all Playlists");
        System.out.println("6 - Exit");

        System.out.println("************************************");
        int choice1 = in.nextInt();

        while (choice1 != 6){

            if (choice1 == 1){
                Playlist p = new Playlist();
                playlists.add(p);
                System.out.println("How many songs do you want to add to playlist?");
                int choice2 = in.nextInt();
                in.nextLine();

                for (int i = 0; i < choice2; i ++){
                    System.out.println("Enter artist name for Song " + (i+1));
                    String artist = in.nextLine();
                    System.out.println("Enter album name for Song " + (i+1));
                    String album = in.nextLine();
                    System.out.println("Enter song name for Song " + (i+1));
                    String song = in.nextLine();
                    System.out.println("Enter song duration for Song " + (i+1));
                    int duration = in.nextInt();
                    in.nextLine();
                    System.out.println("Enter the times song has been played for Song " + (i+1));
                    int tp = in.nextInt();
                    in.nextLine();

                    Song song1 = new Song(song, artist, album,  duration, tp);
                    p.addSong(song1);
                }

                System.out.println("Enter playlist name: ");
                String name = in.nextLine();
                System.out.println("Enter creator of playlist: ");
                String creator = in.nextLine();
                System.out.println();
                System.out.println("0-Country");
                System.out.println("1-Electronic");
                System.out.println("2-Pop Music");
                System.out.println("3-Rock Music");
                System.out.println("4-Jazz");
                System.out.println("5-Classical");
                System.out.println("Select genre of playlist :");
                int genre = in.nextInt();
                in.nextLine();

                p.setName(name);
                p.setCreator(creator);
                p.setGenre(genres.get(genre));
            }
            
            else if (choice1 == 2){
                System.out.println("Displaying the playlist: " + playlists.get(0).getName());
                System.out.println(playlists.get(0));
            }

            else if (choice1 == 3){
                System.out.println("Sorted Playlists:");
                playlists.get(0).sortByDurationDesc();
                System.out.println(playlists.get(0));
            }

            else if (choice1 == 4){
                System.out.println("Which song do you want to remove? (Remove by index)");
                int i = in.nextInt();
                in.nextLine();
                playlists.get(0).removeSong(playlists.get(0).getSongs().get(i));
            }

            else if (choice1 == 5){
                System.out.println("All playlists: ");
                for (Playlist p : playlists){
                    System.out.println(p);
                }
            }
            

            System.out.println();
            System.out.println("1 - Create a new Playlist");
            System.out.println("2 - Display the Playlist");
            System.out.println("3 - Sort the Playlist");
            System.out.println("4 - Remove song by index from the current Playlist");
            System.out.println("5 - Display all Playlists");
            System.out.println("6 - Exit");

            System.out.println("************************************");
            choice1 = in.nextInt();
            in.nextLine();

        }

        in.close();
    }
}
