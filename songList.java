package spotify;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class songList {

    private ArrayList<song> songs = new ArrayList<song>();

    public songList() {
        songs.add(new song ("Murder On The Dancefloor", "Sophie Ellis-Bextor", 56784321));
    songs.add(new song ("Stay", "Rihanna", 90876543));
songs.add(new song ("Talking Body", "Tove Lo", 76658433));
songs.add(new song ("The Color Violet", "Tory Lanez", 76554896));
songs.add(new song ("Love On The Brain", "Rihanna", 99873276));
songs.add(new song ("Lesley", "Dave", 98744321));
songs.add(new song ("Water", "Tyla", 76543245));
songs.add(new song ("life gets hard", "iilliaa", 87776532));
songs.add(new song ("Reminder", "The Weeknd", 88876332));
songs.add(new song ("Blue Lights", "Jorja Smith", 76552319));}

public void addSong() {

    Scanner Scanner = new Scanner(System.in);
 
    System.out.println("Which artist's name would you like to add?");

    String artist = Scanner.nextLine();

    System.out.println("What's the song called?");

    String title = Scanner.nextLine();
 
    System.out.println("What is the number of plays for this song?");

    int playCount;

    while (true) {

        try {

            playCount = Integer.parseInt(Scanner.nextLine());

            break;

        } catch (NumberFormatException e) {

            System.out.println("For the play count, please provide a valid number");

        }

    }
 
    song newSong = new song(artist, title, playCount);
 
    songs.add(newSong);
 
    System.out.println("The song was successfully added");

}


public void removeSong() {
        Scanner scanner = new Scanner(System.in);
   
        System.out.println("Which artist's name would you like to have removed?");
        String removeArtist = scanner.nextLine();
   
        System.out.println("Which song's title would you like removed?");
        String removeTitle = scanner.nextLine();
   
        Iterator<song> iterator = songs.iterator();
       
       
   
        while (iterator.hasNext()) {
            song currentSong = iterator.next();
   
            if (currentSong.getArtist().equals(removeArtist) || currentSong.getTitle().equals(removeTitle)) {
                iterator.remove();
               
            }
        }
 
        System.out.println("This song was removed successfully");
    }

public void printSong()
    {
         for(song printSong : songs)
        {
            System.out.println(" artist: " + printSong.getArtist() + " title: " + printSong.getTitle() + " streams: " + printSong.getPlays());
        }
    }}