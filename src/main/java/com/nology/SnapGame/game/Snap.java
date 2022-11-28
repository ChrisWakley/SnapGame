package com.nology.SnapGame.game;

import java.util.Scanner;

public class Snap extends CardGame {

    private final Scanner scanner = new Scanner(System.in);
    protected int card = 0;
    protected boolean flag = true;

    public Snap() {

    }

    public void playSnap() {

        while (card <= 52) {
            String input = scanner.nextLine();
            String playerOne = TextInterraction.playerOne;
            String playerTwo = TextInterraction.playerTwo;
            if (card == 52) {
                System.out.println("The game ended in a tie!");
                deck.clear();
                playDeck.clear();
                return;
            } else if (flag) {
                if (input.isEmpty()) {
                    dealCard(playDeck);
                    card++;
                    System.out.println(playerOne + " has taken a turn.\n\n");
//                    System.out.println("Turn count = " + card);
//                    System.out.println("flag is: " + flag);
                    flag = false;

                    if (CardGame.playDeck.size() > 1 && CardGame.playDeck.get(CardGame.playDeck.size() - 1).getValue() == CardGame.playDeck.get(CardGame.playDeck.size() - 2).getValue()) {
                        flag = true;
                        System.out.println("enter SNAP to win!");
                        long startTimer = System.currentTimeMillis();
                        String snapInput = scanner.next().toLowerCase();
                        long stopTimer = System.currentTimeMillis();
                        long reactTime = stopTimer - startTimer;
                        if (snapInput.equals("snap") && reactTime < 3000) {
                            deck.clear();
                            playDeck.clear();
                            System.out.println("SNAP! " + playerOne + " wins the game!");
                            System.out.println("Reaction time was: " + (reactTime / 1000) + " seconds.\n");
                            return;
                        } else if (reactTime >= 3000) {
                            System.out.println(playerOne + "'s reaction time was: " + (reactTime / 1000) + " seconds.");
                            System.out.println(playerOne + " has missed their opportunity to win, the game will continue.\n");
                        }
                    } else {
                        System.out.println(playerTwo + "'s turn!");
                    }
                } else {
                    System.out.println("This input does not accept text entry. please leave it \nblank and press 'enter' to take a turn.");
                }
            } else if (!flag) {
                if (input.isEmpty()) {
                    dealCard(playDeck);
                    card++;
                    System.out.println(playerTwo + " has taken a turn.\n\n");
//                    System.out.println("Turn count = " + card);
//                    System.out.println("flag is: " + flag);
                    flag = true;

                    if (CardGame.playDeck.size() > 1 && CardGame.playDeck.get(CardGame.playDeck.size() - 1).getValue() == CardGame.playDeck.get(CardGame.playDeck.size() - 2).getValue()) {
                        flag = false;
                        System.out.println("enter SNAP to win!");
                        long startTimer = System.currentTimeMillis();
                        String snapInput = scanner.next().toLowerCase();
                        long stopTimer = System.currentTimeMillis();
                        long reactTime = stopTimer - startTimer;
                        if (snapInput.equals("snap") && reactTime < 3000) {
                            deck.clear();
                            playDeck.clear();
                            System.out.println("SNAP! " + playerTwo + " wins the game!");
                            System.out.println("Reaction time was: " + (reactTime / 1000) + " seconds.\n");
                            return;
                        } else if (reactTime >= 3000) {
                            System.out.println(playerTwo + "'s reaction time was: " + (reactTime / 1000) + " seconds.");
                            System.out.println(playerTwo + " has missed their opportunity to win, the game will continue.\n");
                        }
                    } else {
                        System.out.println(playerOne + "'s turn!");
                    }
                } else {
                    System.out.println("This input does not accept text entry. please leave it \nblank and press 'enter' to take a turn.");
                }
            }
        }
    }
}



