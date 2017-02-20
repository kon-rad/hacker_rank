/*
 *  Konrad Gnat
 *  Completed 02/09/17
 * 
 */
package hangmanapplication;

import java.io.IOException;
import java.util.Scanner;

public class HangmanApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to hangman! I will pick a word and you will\n"
            + "try to guess it. If you guess wrong 6 times, then I win"
            + ".\n Are you ready? I hope so because I am!\n");
        System.out.println();
        System.out.println("I have picked my word. Below is a picture, and below\n"
            + " that is your current guess, which starts off as nothin. Every\n "
            + "time you guess incorrectly. I add a body part to the picture.\n " 
            + "When there is a full person, you loose\n");
        boolean doYouWantToPlay = true;
        while(doYouWantToPlay) {
            // Setting up the game
            System.out.println("Alright! Let's play!\n");
            Hangman game = new Hangman();
            
            do {
                // Draw the things ...
                System.out.println();
                System.out.println(game.drawPicture());
                System.out.println();
                System.out.println(game.getFormalCurrentGuess());
                //System.out.print(game.mysteryWord);
                System.out.println("Enter a character that you think is in the\n"
                        + "word.");
                char guess = (sc.next().toLowerCase()).charAt(0);
                System.out.println();
                // Check if the character is guessed before
                while (game.isGuessedAlready(guess)) {
                    System.out.println("Try again! You've already guessed that\n"
                            + " character.");
                    guess = (sc.next().toLowerCase()).charAt(0);
                }
                
                if(game.playGuess(guess)) {
                    System.out.println("Great guess! That character is in the\n"
                            + " word!"); 
                } else {
                    System.out.println("Unfortunately that character isn't in \n"
                            + "in the word"); 
                }
                
                // Get the guess
                
                // Play the Game
                
                
            } while(!game.gameOver());
            
            // Play again or no?
            System.out.println();
            System.out.println("Do you want to play another game?\nEnter Y if "
                    + "you do.");
            Character response = (sc.next().toUpperCase()).charAt(0);
            doYouWantToPlay = (response == 'Y');
                
            
            
        }
    }
    
}
