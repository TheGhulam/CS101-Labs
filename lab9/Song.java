package lab9;

public class Song implements Comparable<Song>{
    private String title;
    private String artist;
    private String album;
    private int duration;
    private int timesPlayed;

    public Song(String title, String artist, String album, int d, int t){
        setTitle(title);
        setArtist(artist);
        setAlbum(album);
        setDuration(d);
        setTimesPlayed(t);
    }

    private void setTitle(String t){
        title = t;
    }

    private void setArtist(String a){
        artist = a;
    }

    private void setAlbum(String a){
        album = a;
    }

    private void setDuration(int d){
        duration = d;
    }

    private void setTimesPlayed(int t){
        timesPlayed = t;
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public String getAlbum(){
        return album;
    }

    public int getDuration(){
        return duration;
    }

    public int getTimesPlayed(){
        return timesPlayed;
    }

    // Sort Songs by duration
    public int compareTo(Song b){
        if (this.duration > b.getDuration()){
            return 1;
        }
        else if (this.duration == b.getDuration()){
            return 0;
        }
        else{
            return -1;
        }
    }

    public String toString(){
        String result = "";
        // result += "***********************************************************\n";
        result += "Song name: " + getTitle()+ "\n";
        result += "Artist name: " + getArtist()+ "\n";
        result += "Album name" + getAlbum()+ "\n";
        int minutes = getDuration() / 60;
        int seconds = getDuration() % 60;
        result += "Duration: " + minutes + ":" + seconds + "\n";
        result += "Times Played: " + getTimesPlayed()+ "\n";
        return result;
    }
}
