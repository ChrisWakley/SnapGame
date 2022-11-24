package com.nology.SnapGame.game;

import java.util.Scanner;

public class TextInterraction {

    public static String nameOne;

    public boolean welcome () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("(☞ﾟヮﾟ)☞  Welcome to Game selection!  ☜(ﾟヮﾟ☜) \n\nPlayer One, please enter your name: ");
        //Can implement a second player input here.
        String nameOne = scanner.next();
        System.out.println("Hello " + nameOne + "! \nEnter 'Snap' to begin playing Snap. \n\nEnter 'Quit' to quit selection.");
        //possibility to expand cardGame into a launcher platform for different card games.
        //this would allow the use of the same card load to be used for different card games.
        String choice = scanner.next().toLowerCase();

        if(choice.equals("snap") ) {
            System.out.println("(☞ﾟヮﾟ)☞  Welcome to Snap!  ☜(ﾟヮﾟ☜) \n\nPress enter to draw a card.");
        } else if (choice.equals("quit") ) {
            System.out.println("Quitting game...");
            scanner.close();
        } else {
            System.out.println("Please input a valid response.");
        } return true;
    }
}
