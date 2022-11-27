package com.nology.SnapGame.game;

import java.util.Scanner;

import static com.nology.SnapGame.game.CardGame.deck;
import static com.nology.SnapGame.game.CardGame.playDeck;

public class TextInterraction {

    public static String playerOne;
    public static String playerTwo;
    protected static boolean replay;

    public boolean welcome () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("(☞ﾟヮﾟ)☞  Welcome to Game selection!  ☜(ﾟヮﾟ☜) \n\nPlayer One, please enter your name: ");
        //Can implement a second player input here.
        String nameOne = scanner.next();
        playerOne = nameOne;
        System.out.println("Player Two, please enter your name: ");
        String nameTwo = scanner.next();
        playerTwo = nameTwo;
        System.out.println("Hello " + nameOne + " and " + nameTwo + "! \nEnter 'Snap' to begin playing Snap. \n\nEnter 'Quit' to quit selection.");
        //possibility to expand cardGame into a launcher platform for different card games.
        //this would allow the use of the same card load to be used for different card games.
        String choice = scanner.next().toLowerCase();

        if(choice.equals("snap") ) {
            System.out.println("(☞ﾟヮﾟ)☞  Welcome to Snap!  ☜(ﾟヮﾟ☜) \n\n" + playerOne +
                    " Press enter to draw the first card. \n\nTake turns drawing cards, if you get a snap \non your turn enter 'snap' in the text field \nwithin " +
                    "2 seconds to win the game, \nif you run out of time you will lose!" );
        } else if (choice.equals("quit") ) {
            System.out.println("Quitting game...");
            scanner.close();
        } else {
            System.out.println("Please input a valid response.");
        } return true;
    }
    //asks the player for input to answer if they wish to play again.
    public boolean rerun() {
        Scanner userReply = new Scanner(System.in);
        System.out.println("Press any key to play again. Press N to exit game.");
        String response = userReply.nextLine().toLowerCase();
        if (!response.equals("n")) {
            replay = true;
            System.out.println("Game reset, press enter to draw a new card.");
        } else {
            replay = false;
            deck.clear();
            playDeck.clear();
            System.out.println("game exit");
            userReply.close();
        }
        return true;
    }
}
