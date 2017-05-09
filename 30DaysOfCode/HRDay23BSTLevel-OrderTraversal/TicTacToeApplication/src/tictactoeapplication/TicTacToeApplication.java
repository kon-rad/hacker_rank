/*
 *  Konrad Gnat
 *  
 * 
 */
package tictactoeapplication;

import java.util.Scanner;

/**
 *
 * @author konradgnat
 */
public class TicTacToeApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // allwos for continuos games
        boolean doYouWantToPlay = true;
        while(doYouWantToPlay) {
            
            // setting up our tokens and AI
            System.out.println("Welcome to Tic Tac Toe! You are about to " 
                + " to go against the master of Tic Tac Toe. \nAre you ready?"
                    + " but first you must pick what character you want to be "
                    + "\n and which character I will be");
            System.out.println();
            System.out.println("Enter a single character that will represent"
                + " \n you  on the board");
            char playerToken = sc.next().charAt(0);
            System.out.println("Enter a single character that will represent "
                + "your opponent on the board");
            char opponentToken = sc.next().charAt(0);
            TicTacToe game = new TicTacToe(playerToken, opponentToken);
            AI ai = new AI();
            
            // Set up the game
            System.out.println();
            System.out.println("Now we can start the game. To play enter a" 
                + "\n a number and a token shall be put in its place\n The "
                + " from 1-9, left to right We shall see who sill win this round.");
            TicTacToe.printIndexBoard();
            System.out.println();
            
            // Let's play!
            while(game.gameOver().equals("not over")) {
                if (game.currentMarker == game.userMarker) {
                    // USER TURN
                    
                    System.out.println("It's your turn! Enter a spot for your token");
                    int spot = sc.nextInt();
                    while(!game.playTurn(spot)) {
                        System.out.println("Try again, " + spot + "is invalid."
                            + " this spot is already taken\n or it is out of range");
                        spot = sc.nextInt();
                    }
                    System.out.println("You picked " + spot + "!");
                } else {
                    // AI turn
                    System.out.println("It's my turn!");
                    // Pick spot
                    int aiSpot;
                    aiSpot = ai.pickSpot(game);
                    game.playTurn(aiSpot);
                    System.out.println("I picked " + aiSpot + "!");
                }
                //Print out new board 
                System.out.println();
                game.printBoard();
            
            }
            System.out.println(game.gameOver());
            System.out.println();
            // Set up a new game... or not
            System.out.println("Do you want to play again?" 
                + "\n Enter Y if you do.\n enter anything else if not");
            char response = sc.next().charAt(0);
            doYouWantToPlay = (response == 'Y');
            System.out.println();
            System.out.println();
            
        }
    }
    
}
