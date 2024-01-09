package spotify;
public class song {
    private String title;
    private String artist;
    private int plays;



    public song(String title, String artist, int plays) {
        this.title = title; 
        this.artist = artist;
        this.plays = plays;
    }

    public String getTitle() {
        return title;
}
public String getArtist() {
    return artist;
}
public int getPlays() {
    return plays;
}
}