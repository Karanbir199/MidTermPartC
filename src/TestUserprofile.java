
import java.util.Scanner;
import midtermexam_versiona_extensioncode.UserProfile;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T450
 */
public class TestUserprofile {
    
    public static void main(String[] args) {
    
    
    
   

        
        System.out.println("Genres: ");
        String[] genres = {"Horror", "Action", "Thriller"};
        
        for (String genre : genres) {
            System.out.println(genre);
        }
        
         Scanner input = new Scanner(System.in);

        
        System.out.print("Please enter your full name");
        String nameUsr = input.nextLine();
        
        

    
        System.out.print("pick your favorite genre ");
        int select = input.nextInt();
        input.nextLine(); // Consume newline character
        if (select < 1 || select > genres.length) {
            System.out.println("genre not available");
            return;
        }
        String genreUsr = genres[select - 1];

        UserProfile userProfile = new UserProfile(nameUsr, genreUsr);

      
        System.out.println("Profile name: " + userProfile.getUserID() +
                "have picked the genre: " + userProfile.getGenre());


    
    }
}
