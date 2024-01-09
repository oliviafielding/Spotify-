package spotify;

import java.util.Scanner;
import java.util.ArrayList;

public class main {

    public static void main (String[] args) {
    
        Scanner scanner = new Scanner (System.in);
        int songNumber;
        String tune;
        songList object = new songList();
    
    do {
        System.out.println ("Please Choose An Option:");
        System.out.println ("To Add a song, Press 1");
        System.out.println ("To Remove a song, Press 2");
        System.out.println ("To View the entire song list, Press 3");
        System.out.println ("To View songs with the most plays, Press 4");
        System.out.println ("Press 0 To Exit");

    songNumber = scanner.nextInt();

        if (songNumber == 1) {
            String answer;
            object.addSong();
            do{
                System.out.println ("Would you like to add one more song?");
                scanner.nextLine();
                answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("Yes"))
                {   
                    object.addSong();
                } 
                
                
            } while (answer.equalsIgnoreCase("Yes"));
            
         
        } else if (songNumber == 2) {
            String answer2;
            object.removeSong();
        
        } else if (songNumber == 3) {
            System.out.println ("This is the complete song list:");
            object.printSong();

        } else if (songNumber == 4) {
        //object.playCount();
            
        }

    } while (songNumber!= 0);

}
}
    