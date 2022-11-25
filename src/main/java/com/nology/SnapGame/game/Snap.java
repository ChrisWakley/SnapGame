package com.nology.SnapGame.game;

import java.util.Scanner;

public class Snap extends CardGame {

    private final Scanner scanner = new Scanner(System.in);
    protected int card = 0;
    protected boolean flag = true;

    public Snap() {

    }

    public void playSnap() {

        while (card < 52) {
            String input = scanner.nextLine();
            String playerOne = TextInterraction.playerOne;
            String playerTwo = TextInterraction.playerTwo;
            if (flag) {
                if (input.isEmpty()) {
                    dealCard(playDeck);
                    card++;
                    System.out.println(playerOne + " has taken a turn.");
                    System.out.println("Turn count = " + card);
                    System.out.println("flag is: " + flag);
                    flag = false;

                    if (CardGame.playDeck.size() > 1 && CardGame.playDeck.get(CardGame.playDeck.size() - 1).getValue() == CardGame.playDeck.get(CardGame.playDeck.size() - 2).getValue()) {
                        System.out.println("SNAP! " + playerOne + " wins the game!");
                        scanner.close();
                    } else {
                        System.out.println(playerTwo + "'s turn!");
                    }
                }
            }
            if (!flag) {
                if (input.isEmpty()) {
                    dealCard(playDeck);
                    card++;
                    System.out.println(playerTwo + " has taken a turn.");
                    System.out.println("Turn count = " + card);
                    System.out.println("flag is: " + flag);
                    flag = true;

                    if (CardGame.playDeck.size() > 1 && CardGame.playDeck.get(CardGame.playDeck.size() - 1).getValue() == CardGame.playDeck.get(CardGame.playDeck.size() - 2).getValue()) {
                        System.out.println("SNAP! " + playerTwo + " wins the game!");
                        scanner.close();
                    } else {
                        System.out.println(playerOne + "'s turn!");
                    }
                }
            }
            if(card == 52) {
                System.out.println("The game ended in a tie!");
            }
        }
    }
}
